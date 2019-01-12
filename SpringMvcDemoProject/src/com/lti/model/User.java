package com.lti.model;

public class User {

	private int userId;
	private String email;
	private String password;
	private String phoneNumber;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", email=" + email + ", password=" + password + ", phoneNumber=" + phoneNumber
				+ "]";
	}
	public User(int userId, String email, String password, String phoneNumber) {
		super();
		this.userId = userId;
		this.email = email;
		this.password = password;
		this.phoneNumber = phoneNumber;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	
	
	
}
