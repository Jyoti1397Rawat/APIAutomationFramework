package com.API.Test;

import org.testng.annotations.Test;

import com.API.Base.AuthService;
import com.API.Base.UserProfileManagementService;
import com.API.Model.Request.LoginRequest;
import com.API.Model.Request.ProfileRequest;
import com.API.Model.Response.LoginResponse;
import com.API.Model.Response.UserProfileResponse;

import io.restassured.response.Response;

public class UpdateProfileTest {

	@Test
	public void getProfile() {
		LoginRequest loginRequest = new LoginRequest("jooo", "Perfected@13");
		AuthService authService = new AuthService();
		Response response = authService.login(loginRequest);
		LoginResponse loginResponse = response.as(LoginResponse.class);
		String token = loginResponse.getToken();
		System.out.println(token);
		
		UserProfileManagementService userProfileManagementService =new UserProfileManagementService();
		response = userProfileManagementService.getProfile(token);
		System.out.println(response.asPrettyString());
		UserProfileResponse userProfileResponse = response.as(UserProfileResponse.class);
		System.out.println(userProfileResponse);
		
		ProfileRequest profileRequest = new ProfileRequest.Builder().
										firstName("Jyoti")
										.lastName("Rawat")
										.email("jyoti1397rawat@gmail.com")
										.mobileNumber("9990252016").
										build();
		response = userProfileManagementService.updateProfile(token, profileRequest);
		System.out.println(response.asPrettyString());
	}
}
