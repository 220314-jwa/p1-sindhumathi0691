package com.sindhuTRMS.data;

import com.sindhuTRMS.exceptions.IncorrectCredentialsException;
import com.sindhuTRMS.models.Employee;


public interface EmployeeDAO extends GenericDAO <Employee> {
	
	public static Employee getByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}
	public Employee logIn(String username, String password) throws IncorrectCredentialsException;
	public Employee getByEmployee_id(String Username);
	
	
	

}
