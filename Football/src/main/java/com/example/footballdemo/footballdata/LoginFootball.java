package com.example.footballdemo.footballdata;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class LoginFootball {
	@Id
	private int userid;
	private String uname;
	private String password;
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
