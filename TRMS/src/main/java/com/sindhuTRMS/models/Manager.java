package com.sindhuTRMS.models;

import java.util.ArrayList;
import java.util.List;



public class Manager {


	private int manager_id;
	private String manager_firstname;
	private String manager_lastname;
	private String username;
	private String password;
	private List<Reimb> reimb;
	
	
public Manager() {
		
	
		manager_id=0;
		manager_firstname="";
		manager_lastname="";
		username="";
		password="";
		reimb = new ArrayList<>();
	
	}
	

@Override
public String toString() {
	return "Manager [ manager_id=" + manager_id + ", manager_firstname=" + manager_firstname
			+ ", manager_lastname=" + manager_lastname + ",username=" + username + ",password =" + password + ", reimb=" + reimb + "]";
}



@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + manager_id;
	result = prime * result + ((manager_firstname == null) ? 0 : manager_firstname.hashCode());
	result = prime * result + ((manager_lastname == null) ? 0 : manager_lastname.hashCode());
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
	Manager other = (Manager) obj;
	
	
	
		
	if (manager_id != other.manager_id)
		return false;

	
	if (manager_firstname == null) {
		if (other.manager_firstname != null)
			return false;
	} else if (!manager_firstname.equals(other.manager_firstname))
		return false;
	
	if (manager_lastname == null) {
		if (other.manager_lastname != null)
			return false;
	} else if (!manager_lastname.equals(other.manager_lastname))
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

	
	

	public int getManager_id() {
		return manager_id;
	}


	public void setManager_id(int manager_id) {
		this.manager_id = manager_id;
	}


	

	public String getManager_firstname() {
		return manager_firstname;
	}


	public void setManager_firstname(String manager_firstname) {
		this.manager_firstname = manager_firstname;
	}


	public String getManager_lastname() {
		return manager_lastname;
	}


	public void setManager_lastname(String manager_lastname) {
		this.manager_lastname = manager_lastname;
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
