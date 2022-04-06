package com.sindhuTRMS.data.Impl;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.sindhuTRMS.models.Status;

public class StatusDAOImplTest {
	
	
	
	StatusDAOImpl statusDAOImplObj = new StatusDAOImpl(); 
	
	@Test
	public void createstatus() {
		
		//Setup  - Test data 
		Status s = new Status();
		
		s.setStatus_id(2);
		s.setStatus_name("not yet available");
		
		
		// call the methods we are testing
		
//		int result = statusDAOImplObj.create(s);
//		System.out.println(result);
		
		assertNotNull(statusDAOImplObj.create(s));
		
	}
	
	
	
	
	
	
	
	
	
	
	
}