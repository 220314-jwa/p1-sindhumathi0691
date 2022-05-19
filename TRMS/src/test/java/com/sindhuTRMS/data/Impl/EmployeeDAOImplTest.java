package com.sindhuTRMS.data.Impl;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import com.sindhuTRMS.models.Employee;
import com.sindhuTRMS.models.EventType;


public class EmployeeDAOImplTest {
	
	//this is the instance for the class which we are trying to test
EmployeeDAOImpl employeeDAOImplObj = new EmployeeDAOImpl(); 
	
	@Test
	public void createemployee() {
		
		//to Setup  - Test data  
		Employee emp = new Employee();
		
		//emp.setEmployee_id(0);
		emp.setFirst_name("suriya");
		emp.setLast_name("naren");
		emp.setusername("suriya01");
		emp.setpassword("password123");
		emp.setManager_id(4);
		emp.setDept_id(4);
		
		// call the methods we are testing
		
		
		assertNotNull(employeeDAOImplObj.create(emp));
		
		
	}
	

	
//	
//	@Test
//	public void getAll() {
//		assertNotNull(employeeDAO.getAll());
//	}
	
	
//	
//	@Test
//	public void getByIdExists() {
//		
//		int employeeId = testEmployee.getemployeeId();
//		Employee employee = employeeDAO.getById(employeeId);
//		
//		assertEquals(testEmployee, employee);
//	}
	
	
//	
//	@Test
//	public void getByIdDoesNotExist() {
//		Employee employee = employeeDAO.getById(0);
//		assertNull(employee);
//	}
//	
	
	
	
	
}
