package com.tejcomputers.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class StudentCredential {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int scid;
	
	private String stuloginid;
	
	private String stupassword;

	public int getScid() {
		return scid;
	}

	public void setScid(int scid) {
		this.scid = scid;
	}



	public String getStuloginid() {
		return stuloginid;
	}

	public void setStuloginid(String stuloginid) {
		this.stuloginid = stuloginid;
	}

	public String getStupassword() {
		return stupassword;
	}

	public void setStupassword(String stupassword) {
		this.stupassword = stupassword;
	}
	
	
	
	
	
}
