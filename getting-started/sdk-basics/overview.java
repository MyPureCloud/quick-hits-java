// >> START sdk-overview This example demonstrates authorizing using client credentials and getting a list of users
String clientId = "a0bda580-cb41-4ff6-8f06-28ffb4227594";
String clientSecret = "e4meQ53cXGq53j6uffdULVjRl8It8M3FVsupKei0nSg";

//Set Region
PureCloudRegionHosts region = PureCloudRegionHosts.us_east_1;

ApiClient apiClient = ApiClient.Builder.standard().withBasePath(region).build();
ApiResponse<AuthResponse> authResponse = apiClient.authorizeClientCredentials(clientId, clientSecret);

// Don't actually do this, this logs your auth token to the console!
System.out.println(authResponse.getBody().toString());

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

// Create API instances and make authenticated API requests
UsersApi apiInstance = new UsersApi();
UserEntityListing response = apiInstance.getUsers(null, null, null, null, null, null);
// >> END sdk-overview
