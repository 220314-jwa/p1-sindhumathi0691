package com.sindhuTRMS.data.Impl;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import com.sindhuTRMS.models.Department;
import com.sindhuTRMS.models.EventType;


public class DeptDAOImplTest {
	
	//this is the instance for the class which we are trying to test
DeptDAOImpl DeptDAOImplObj = new DeptDAOImpl(); 
	
	@Test
	public void createdept() {
		
		//to Setup  - Test data  
		Department dept = new Department();
		
		//dept.setDept_id(0);
		dept.setDept_name("Food Department");
		dept.setdept_head_id(4);
		
		// call the methods we are testing
		
		
		assertNotNull(DeptDAOImplObj.create(dept));
		
		
	}
	

	

//	@Test
//	public void testGetByDept_idDoesNotExist() {
//		int dept = departmentDAO.getByDept_id(0);
//		assertNull(testDept);
//	}
	
	
//	@Test
//	public void testGetByDept_name() {
//		Department department = departmentDAO.getByDept_name("thisguy");
//		assertNotNull(testDept);
//	}
	
	
	
	
//	@Test
//	public void testGetByDept_head_id() {
//		Department department = departmentDAO.getByDept_head_id(1234);
//		assertNull(testDept);
//	}
//	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
