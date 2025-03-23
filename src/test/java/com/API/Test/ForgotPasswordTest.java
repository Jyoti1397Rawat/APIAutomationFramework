package com.API.Test;

import org.testng.annotations.Test;

import com.API.Base.AuthService;
import com.API.Base.BaseService;

import io.restassured.response.Response;

public class ForgotPasswordTest extends BaseService{

	@Test
	public void createAccount() {
		
		AuthService authService = new AuthService();
		Response response = authService.forgetPassword("jyoti1397rawat@gmail.com");
		System.out.println(response.asPrettyString());
		//Assert.assertEquals(response.asPrettyString(), "User registered successfully!");
	}
}
