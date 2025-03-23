package com.API.Test;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;


public class login {

	@Test
	public void sysout() {
		// TODO Auto-generated method stub
		Response response = RestAssured.given().baseUri("http://64.227.160.186:8080").header("Content-Type","application/json")
				.body("{\r\n"
						+ "  \"username\": \"jooo\","
						+ "  \"password\": \"Perfected@13\""
						+ "}").post("/api/auth/login");
		System.out.println(response.asPrettyString());
	}
}
