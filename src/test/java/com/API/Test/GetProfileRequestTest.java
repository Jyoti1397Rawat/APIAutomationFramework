package com.API.Test;

import org.testng.annotations.Test;

import com.API.Base.AuthService;
import com.API.Base.UserProfileManagementService;
import com.API.Model.Request.LoginRequest;
import com.API.Model.Response.LoginResponse;
import com.API.Model.Response.UserProfileResponse;

import io.restassured.response.Response;

public class GetProfileRequestTest {

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
	}
}
