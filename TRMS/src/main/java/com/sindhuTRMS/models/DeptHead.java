package com.sindhuTRMS.models;

import java.util.ArrayList;
import java.util.List;



public class DeptHead {


	private int dept_head_id;
	private String dept_head_firstname;
	private String dept_head_lastname;
	private String username;
	private String password;
	private List<Reimb> reimb;
	
	
public DeptHead() {
		
	
	dept_head_id=0;
	dept_head_firstname="";
	dept_head_lastname="";
	username="";
	password="";
	reimb = new ArrayList<>();
	
	}
	

@Override
public String toString() {
	return "DeptHead [ dept_head_id=" + dept_head_id + ", dept_head_firstname=" + dept_head_firstname
			+ ", dept_head_lastname=" + dept_head_lastname + ",username=" + username + ",password =" + password + ", reimb=" + reimb + "]";
}



@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + dept_head_id;
	result = prime * result + ((dept_head_firstname == null) ? 0 : dept_head_firstname.hashCode());
	result = prime * result + ((dept_head_lastname == null) ? 0 : dept_head_lastname.hashCode());
	result = prime * result + ((username == null) ? 0 : username.hashCode());
	result = prime * result + ((password == null) ? 0 : password.hashCode());
	result = prime * result + ((reimb == null) ? 0 : reimb.hashCode());
	
	return result;
}


@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	
	if (getClass() != obj.getClass())
		return false;
	DeptHead other = (DeptHead) obj;
	
	
	
		
	if (dept_head_id != other.dept_head_id)
		return false;

	
	if (dept_head_firstname == null) {
		if (other.dept_head_firstname != null)
			return false;
	} else if (!dept_head_firstname.equals(other.dept_head_firstname))
		return false;
	
	if (dept_head_lastname == null) {
		if (other.dept_head_lastname != null)
			return false;
	} else if (!dept_head_lastname.equals(other.dept_head_lastname))
		return false;

	if (username == null) {
		if (other.username != null)
			return false;
	} else if (!username.equals(other.username))
		return false;
	

	if (password == null) {
		if (other.password != null)
			return false;
	} else if (!password.equals(other.password))
		return false;
	
	
		
	if (reimb == null) {
		if (other.reimb != null)
			return false;
	} else if (!reimb.equals(other.reimb))
		return false;
	

	
	return true;
	
	
}

	
	

	public int getDeptHead_id() {
		return dept_head_id;
	}


	public void setDeptHead_id(int dept_head_id) {
		this.dept_head_id = dept_head_id;
	}


	

	public String getDeptHead_firstname() {
		return dept_head_firstname;
	}


	public void setDeptHead_firstname(String dept_head_firstname) {
		this.dept_head_firstname = dept_head_firstname;
	}


	public String getDeptHead_lastname() {
		return dept_head_lastname;
	}


	public void setDeptHead_lastname(String dept_head_lastname) {
		this.dept_head_lastname = dept_head_lastname;
	}



	public String getusername() {
		return username;
	}


	public void setusername(String username) {
		this.username = username;
	}


	public String getpassword() {
		return password;
	}


	public void setpassword(String password) {
		this.password = password;
	}
	
	
	
	public List<Reimb> getReimb() {
		return reimb;
	}


	public void setReimb(List<Reimb> reimb) {
		this.reimb = reimb;
	}


	
	
	

	
	
	
	
}
