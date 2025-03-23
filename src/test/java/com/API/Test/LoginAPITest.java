package com.API.Test;

import org.testng.annotations.Test;
import org.testng.annotations.Listeners;

import com.API.Base.AuthService;
import com.API.Model.Request.LoginRequest;
import com.API.Model.Response.LoginResponse;

import io.restassured.response.Response;

@Listeners(com.API.Listeners.TestListener.class)
public class LoginAPITest {

	@Test
	public void loginTest() {
		LoginRequest loginRequest = new LoginRequest("jooo", "Perfected@13");
		AuthService authService = new AuthService();
		Response response = authService.login(loginRequest);
		LoginResponse loginResponse = response.as(LoginResponse.class);
		System.out.println(loginResponse.getToken());
		}
}
