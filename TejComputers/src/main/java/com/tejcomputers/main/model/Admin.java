package com.tejcomputers.main.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Admin {

	@Id
	private int adminid=1;
	
	private String firstname="tej";
	
	private String middlename="abc";
	
	private String lastname="mahajan";
	
	private String adharnumber="343434343434";
	
	private Long whatsappnumber=43443444434l;
	
	private String emailid="dfdf@fgfg.com";
	
	private String loginid="abc";
	
	private String password="abc";
	
	@OneToOne(cascade = CascadeType.ALL)
	private StudentCredential studentCredential;

	@OneToMany(cascade = CascadeType.ALL,mappedBy = "admin")
	private List<StudentRegistration> studentregistration=new ArrayList<>();
	
	





	public StudentCredential getStudentCredential() {
		return studentCredential;
	}

	public void setStudentCredential(StudentCredential studentCredential) {
		this.studentCredential = studentCredential;
	}

	public int getAdminid() {
		return adminid;
	}

	public void setAdminid(int adminid) {
		this.adminid = adminid;
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

	public String getAdharnumber() {
		return adharnumber;
	}

	public void setAdharnumber(String adharnumber) {
		this.adharnumber = adharnumber;
	}

	public Long getWhatsappnumber() {
		return whatsappnumber;
	}

	public void setWhatsappnumber(Long whatsappnumber) {
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

	public List<StudentRegistration> getStudentregistration() {
		return studentregistration;
	}

	public void setStudentregistration(List<StudentRegistration> studentregistration) {
		
		this.studentregistration = studentregistration;
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
