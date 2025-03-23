package com.API.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.API.Base.AuthService;
import com.API.Base.BaseService;
import com.API.Model.Request.SignupRequest;

import io.restassured.response.Response;

public class AccountCreationTest extends BaseService{

	@Test
	public void createAccount() {
		
		SignupRequest signupRequest = new SignupRequest.Builder().username("Disha")
					.email("disha@gmail.com")
					.firstName("Nisha")
					.lastName("Chada")
					.password("Nisha123")
					.mobileNumber("1234567891").build();
		AuthService authService = new AuthService();
		Response response = authService.signUp(signupRequest);
		System.out.println(response.asPrettyString());
		Assert.assertEquals(response.asPrettyString(), "User registered successfully!");
	}
}
