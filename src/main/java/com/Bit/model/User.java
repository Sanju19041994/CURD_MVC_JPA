package com.Bit.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private int userid;
	
	private String userpass;
	
	private String fname;
	
	private String mobile;
	
	private String email;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
		System.out.println("Id setter called");
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
		System.out.println("User Id setter called");
	}

	public String getUserpass() {
		return userpass;
	}

	public void setUserpass(String userpass) {
		this.userpass = userpass;
		System.out.println("Userpass setter called");
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
		System.out.println("Fist name setter called");
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
		System.out.println("Mobile setter called");
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
		System.out.println("Email Id setter called");
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userid=" + userid + ", userpass=" + userpass + ", fname=" + fname + ", mobile="
				+ mobile + ", email=" + email + "]";
	}

	
}