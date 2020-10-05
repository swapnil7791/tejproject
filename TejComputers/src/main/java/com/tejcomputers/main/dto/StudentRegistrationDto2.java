package com.tejcomputers.main.dto;

public class StudentRegistrationDto2 {
	
	
	
	private String loginid;
	
	private String password;
	
	public StudentRegistrationDto2() {}

	public StudentRegistrationDto2(String loginid, String password) {
		
		this.loginid = loginid;
		this.password = password;
	}

	

	public String getLoginid() {
		return loginid;
	}

	public void setLoginid(String loginid) {
		this.loginid = loginid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	

}
