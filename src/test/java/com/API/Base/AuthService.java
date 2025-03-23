package com.API.Base;

import java.util.HashMap;

import com.API.Model.Request.LoginRequest;
import com.API.Model.Request.SignupRequest;

import io.restassured.response.Response;

public class AuthService extends BaseService {

	private static final String BASE_PATH = "/api/auth/";

	public Response login(LoginRequest payload) {
		return postRequest(payload, BASE_PATH+"login");
	}

	public Response signUp(SignupRequest payload) {
		return postRequest(payload, BASE_PATH+"signup");
	}

	public Response forgetPassword(String emailAddress) {
		HashMap<String, String> payload = new HashMap<String, String>();
		payload.put("email", emailAddress);
		return postRequest(payload, BASE_PATH+"forgot-password");
	}
}
