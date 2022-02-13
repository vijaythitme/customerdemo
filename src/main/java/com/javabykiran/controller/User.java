package com.javabykiran.controller;

public class User 
{
	String uname,upass;

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUpass() {
		return upass;
	}

	public void setUpass(String upass) {
		this.upass = upass;
	}

	@Override
	public String toString() {
		return "User [uname=" + uname + ", upass=" + upass + "]";
	}
	
	
	
}
