package com.javabykiran.database;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Student     //Spring contain hibernate
{
	
	@Id
	int sid;
	
	String sname;
	String sphone;
	
	
	
	public int getSid() {
		return sid;
	}


	public void setSid(int sid) {
		this.sid = sid;
	}



	public String getSname() {
		return sname;
	}



	public void setSname(String sname) {
		this.sname = sname;
	}



	public String getSphone() {
		return sphone;
	}


	public void setSphone(String sphone) {
		this.sphone = sphone;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sphone=" + sphone + "]";
	}
	
}
