package io.swagger.api;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Optional;

import io.swagger.model.Profile;
import io.swagger.service.ProfileService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootTest
@AutoConfigureMockMvc
public class ListControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ProfileService profileService;

    private Profile mockProfile;

    private final ObjectMapper objectMapper = new ObjectMapper();

    @BeforeEach
    public void setUp() {
        mockProfile = new Profile();
        mockProfile.setId(1);
        mockProfile.setName("John's Profile");
        mockProfile.setUserId(1);
        mockProfile.setFavorites(new ArrayList<>(Arrays.asList(101, 102)));
        mockProfile.setWatchLater(new ArrayList<>(Arrays.asList(201, 202)));
        mockProfile.setRecentlyWatched(new ArrayList<>(Arrays.asList(301, 302)));
    }


    // ----------------- Favorites Tests -----------------

    @Test
    public void testAddFavorite() throws Exception {
        Integer contentIdToAdd = 103;
        Profile updatedProfile = new Profile();
        updatedProfile.setId(1);
        updatedProfile.setName("John's Profile");
        updatedProfile.setUserId(1);
        updatedProfile.setFavorites(Arrays.asList(101, 102, 103));
        updatedProfile.setWatchLater(Arrays.asList(201, 202));
        updatedProfile.setRecentlyWatched(Arrays.asList(301, 302));

        when(profileService.getProfileById(1)).thenReturn(Optional.of(mockProfile));
        when(profileService.updateProfile(1, mockProfile)).thenReturn(updatedProfile);

        mockMvc.perform(post("/users/1/profiles/1/lists/favorites")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(contentIdToAdd)))
                .andExpect(status().isCreated());
    }

}