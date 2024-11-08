/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.63).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Profile;
import io.swagger.model.User;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.CookieValue;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-10-31T11:39:55.913399844Z[GMT]")
@Validated
public interface UsersApi {

    @Operation(summary = "Get all users", description = "", tags={ "users" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "List of users", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = User.class)))) })
    @RequestMapping(value = "/users",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<User>> usersGet();


    @Operation(summary = "Create a new user", description = "", tags={ "users" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "201", description = "User created successfully"),
        
        @ApiResponse(responseCode = "400", description = "Invalid request") })
    @RequestMapping(value = "/users",
        consumes = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Void> usersPost(@Parameter(in = ParameterIn.DEFAULT, description = "User data", required=true, schema=@Schema()) @Valid @RequestBody User body
);


    @Operation(summary = "Delete a user", description = "", tags={ "users" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "204", description = "User deleted successfully"),
        
        @ApiResponse(responseCode = "404", description = "User not found") })
    @RequestMapping(value = "/users/{userId}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> usersUserIdDelete(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("userId") Integer userId
);


    @Operation(summary = "Get a specific user by ID", description = "", tags={ "users" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "User details", content = @Content(mediaType = "application/json", schema = @Schema(implementation = User.class))),
        
        @ApiResponse(responseCode = "404", description = "User not found") })
    @RequestMapping(value = "/users/{userId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<User> usersUserIdGet(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("userId") Integer userId
);


    @Operation(summary = "Get all profiles of a user", description = "", tags={ "profiles" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "List of profiles for the user", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = Profile.class)))) })
    @RequestMapping(value = "/users/{userId}/profiles",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Profile>> usersUserIdProfilesGet(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("userId") Integer userId
);


    @Operation(summary = "Create a new profile for a user", description = "", tags={ "profiles" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "201", description = "Profile created successfully"),
        
        @ApiResponse(responseCode = "400", description = "Invalid request") })
    @RequestMapping(value = "/users/{userId}/profiles",
        consumes = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Void> usersUserIdProfilesPost(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("userId") Integer userId
, @Parameter(in = ParameterIn.DEFAULT, description = "Profile data", required=true, schema=@Schema()) @Valid @RequestBody Profile body
);


    @Operation(summary = "Delete a profile", description = "", tags={ "profiles" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "204", description = "Profile deleted successfully"),
        
        @ApiResponse(responseCode = "404", description = "Profile not found") })
    @RequestMapping(value = "/users/{userId}/profiles/{profileId}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> usersUserIdProfilesProfileIdDelete(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("userId") Integer userId
, @Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("profileId") Integer profileId
);


    @Operation(summary = "Get profile details by ID", description = "", tags={ "profiles" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Profile details", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Profile.class))),
        
        @ApiResponse(responseCode = "404", description = "Profile not found") })
    @RequestMapping(value = "/users/{userId}/profiles/{profileId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Profile> usersUserIdProfilesProfileIdGet(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("userId") Integer userId
, @Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("profileId") Integer profileId
);


    @Operation(summary = "Remove content from favorites", description = "", tags={ "lists" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "204", description = "Content removed from favorites"),
        
        @ApiResponse(responseCode = "404", description = "Content not found") })
    @RequestMapping(value = "/users/{userId}/profiles/{profileId}/lists/favorites/{contentId}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> usersUserIdProfilesProfileIdListsFavoritesContentIdDelete(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("userId") Integer userId
, @Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("profileId") Integer profileId
, @Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("contentId") Integer contentId
);


    @Operation(summary = "Get favorite content list", description = "", tags={ "lists" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Favorite content list", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = Integer.class)))) })
    @RequestMapping(value = "/users/{userId}/profiles/{profileId}/lists/favorites",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Integer>> usersUserIdProfilesProfileIdListsFavoritesGet(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("userId") Integer userId
, @Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("profileId") Integer profileId
);


    @Operation(summary = "Add content to favorites", description = "", tags={ "lists" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "201", description = "Content added to favorites"),
        
        @ApiResponse(responseCode = "400", description = "Invalid request") })
    @RequestMapping(value = "/users/{userId}/profiles/{profileId}/lists/favorites",
        consumes = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Void> usersUserIdProfilesProfileIdListsFavoritesPost(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("userId") Integer userId
, @Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("profileId") Integer profileId
, @Parameter(in = ParameterIn.DEFAULT, description = "ID of the content to be added to favorites", required=true, schema=@Schema()) @Valid @RequestBody Integer body
);


    @Operation(summary = "Remove content from recently watched list", description = "", tags={ "lists" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "204", description = "Content removed from recently watched"),
        
        @ApiResponse(responseCode = "404", description = "Content not found") })
    @RequestMapping(value = "/users/{userId}/profiles/{profileId}/lists/recently-watched/{contentId}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> usersUserIdProfilesProfileIdListsRecentlyWatchedContentIdDelete(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("userId") Integer userId
, @Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("profileId") Integer profileId
, @Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("contentId") Integer contentId
);


    @Operation(summary = "Get recently watched content list", description = "", tags={ "lists" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Recently watched content list", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = Integer.class)))) })
    @RequestMapping(value = "/users/{userId}/profiles/{profileId}/lists/recently-watched",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Integer>> usersUserIdProfilesProfileIdListsRecentlyWatchedGet(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("userId") Integer userId
, @Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("profileId") Integer profileId
);


    @Operation(summary = "Add content to recently watched", description = "", tags={ "lists" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "201", description = "Content added to recently watched"),
        
        @ApiResponse(responseCode = "400", description = "Invalid request") })
    @RequestMapping(value = "/users/{userId}/profiles/{profileId}/lists/recently-watched",
        consumes = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Void> usersUserIdProfilesProfileIdListsRecentlyWatchedPost(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("userId") Integer userId
, @Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("profileId") Integer profileId
, @Parameter(in = ParameterIn.DEFAULT, description = "ID of the content to be added to recently watched list", required=true, schema=@Schema()) @Valid @RequestBody Integer body
);


    @Operation(summary = "Remove content from watch later list", description = "", tags={ "lists" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "204", description = "Content removed from watch later"),
        
        @ApiResponse(responseCode = "404", description = "Content not found") })
    @RequestMapping(value = "/users/{userId}/profiles/{profileId}/lists/watch-later/{contentId}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> usersUserIdProfilesProfileIdListsWatchLaterContentIdDelete(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("userId") Integer userId
, @Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("profileId") Integer profileId
, @Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("contentId") Integer contentId
);


    @Operation(summary = "Get watch later content list", description = "", tags={ "lists" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Watch later content list", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = Integer.class)))) })
    @RequestMapping(value = "/users/{userId}/profiles/{profileId}/lists/watch-later",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Integer>> usersUserIdProfilesProfileIdListsWatchLaterGet(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("userId") Integer userId
, @Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("profileId") Integer profileId
);


    @Operation(summary = "Add content to watch later", description = "", tags={ "lists" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "201", description = "Content added to watch later"),
        
        @ApiResponse(responseCode = "400", description = "Invalid request") })
    @RequestMapping(value = "/users/{userId}/profiles/{profileId}/lists/watch-later",
        consumes = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Void> usersUserIdProfilesProfileIdListsWatchLaterPost(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("userId") Integer userId
, @Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("profileId") Integer profileId
, @Parameter(in = ParameterIn.DEFAULT, description = "ID of the content to be added to watch later list", required=true, schema=@Schema()) @Valid @RequestBody Integer body
);


    @Operation(summary = "Update a profile", description = "", tags={ "profiles" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Profile updated successfully"),
        
        @ApiResponse(responseCode = "404", description = "Profile not found") })
    @RequestMapping(value = "/users/{userId}/profiles/{profileId}",
        consumes = { "application/json" }, 
        method = RequestMethod.PUT)
    ResponseEntity<Void> usersUserIdProfilesProfileIdPut(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("userId") Integer userId
, @Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("profileId") Integer profileId
, @Parameter(in = ParameterIn.DEFAULT, description = "Updated profile data", required=true, schema=@Schema()) @Valid @RequestBody Profile body
);


    @Operation(summary = "Update user details", description = "", tags={ "users" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "User updated successfully"),
        
        @ApiResponse(responseCode = "404", description = "User not found") })
    @RequestMapping(value = "/users/{userId}",
        consumes = { "application/json" }, 
        method = RequestMethod.PUT)
    ResponseEntity<Void> usersUserIdPut(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("userId") Integer userId
, @Parameter(in = ParameterIn.DEFAULT, description = "Updated user data", required=true, schema=@Schema()) @Valid @RequestBody User body
);

}
