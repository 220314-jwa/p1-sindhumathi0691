package com.sindhuTRMS.data.Impl;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import com.sindhuTRMS.models.DeptHead;
import com.sindhuTRMS.models.EventType;


public class DeptHeadDAOImplTest_NOTREADY {
	
	//this is the instance for the class which we are trying to test
DeptHeadDAOImpl deptHeadDAOImplObj = new DeptHeadDAOImpl(); 
	
	@Test
	public void createdepthead() {
		
		//to Setup  - Test data  
		DeptHead depthead = new DeptHead();
		

		//depthead.setDeptHead_id(0);
		depthead.setDeptHead_firstname("james");
		depthead.setDeptHead_lastname("bond");
		depthead.setusername("james01");
		depthead.setpassword("password");
		
		// call the methods we are testing
		
		
		assertNotNull(deptHeadDAOImplObj.create(depthead));
		
		
	}
	

}
