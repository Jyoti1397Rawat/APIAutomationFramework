package com.API.Model.Response;

import java.util.List;

public class LoginResponse {
	private String token, type, username, email;
	private int id;
	private List<String> roles;
	
	public LoginResponse() {
		
	}
	
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<String> getRoles() {
		return roles;
	}
	public void setRoles(List<String> roles) {
		this.roles = roles;
	}
	@Override
	public String toString() {
		return "LoginResponse [token=" + token + ", type=" + type + ", username=" + username + ", email=" + email
				+ ", id=" + id + ", roles=" + roles + "]";
	}
	public LoginResponse(String token, String type, String username, String email, int id, List<String> roles) {
		super();
		this.token = token;
		this.type = type;
		this.username = username;
		this.email = email;
		this.id = id;
		this.roles = roles;
	}
	
	
}
