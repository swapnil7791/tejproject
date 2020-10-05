package com.tejcomputers.main.dto;

public class StudentRegistrationDto {
	
	private int id;
	
	private String firstname;
	
	private String middlename;
	
	private String lastname;
	
	private long adharnumber;
	
	private long whatsappnumber;
	
	private String emailid;
	
	private String loginid;
	
	private String password;
	
	private String feesPaid;
	
	public StudentRegistrationDto() {}
	
	
	

	



	public StudentRegistrationDto(int id, String firstname, String middlename, String lastname, long adharnumber,
			long whatsappnumber, String emailid, String loginid, String password, String feesPaid) {
		this.id = id;
		this.firstname = firstname;
		this.middlename = middlename;
		this.lastname = lastname;
		this.adharnumber = adharnumber;
		this.whatsappnumber = whatsappnumber;
		this.emailid = emailid;
		this.loginid = loginid;
		this.password = password;
		this.feesPaid = feesPaid;
	}








	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getMiddlename() {
		return middlename;
	}

	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public long getAdharnumber() {
		return adharnumber;
	}

	public void setAdharnumber(long adharnumber) {
		this.adharnumber = adharnumber;
	}

	public long getWhatsappnumber() {
		return whatsappnumber;
	}

	public void setWhatsappnumber(long whatsappnumber) {
		this.whatsappnumber = whatsappnumber;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
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




	public String getFeesPaid() {
		return feesPaid;
	}




	public void setFeesPaid(String feesPaid) {
		this.feesPaid = feesPaid;
	}


	
	
	

}
