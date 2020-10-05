package com.tejcomputers.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.sun.istack.NotNull;

@Entity
public class StudentRegistration {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int stuentid;
	
	private String firstname;
	
	private String middlename;
	
	private String lastname;
	
	private long adharnumber;
	
	private long whatsappnumber;
	
	private String emailid;
	
	private String loginid;
	
	private String password;
	
	//@org.hibernate.annotations.Type(type="yes_no")
	@NotNull
	private String feesPaid;
	
	
	
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="a_id")
	private Admin admin;
	
	
	

	public int getStuentid() {
		return stuentid;
	}

	public void setStuentid(int stuentid) {
		this.stuentid = stuentid;
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

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
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

	public String isFeesPaid() {
		return feesPaid;
	}

	public void setFeesPaid(String feesPaid) {
		this.feesPaid = feesPaid;
	}

	
	

	  
	 
	
	
	
	
}
