package com.api.rest;

public class LoginRequest {
	
    private String email;
    private String password;

    // Getters y setters
  

    public String getPassword() {
        return password;
    }

    public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPassword(String password) {
        this.password = password;
    }
}
