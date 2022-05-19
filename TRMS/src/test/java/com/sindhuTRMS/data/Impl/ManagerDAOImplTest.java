package com.sindhuTRMS.data.Impl;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import com.sindhuTRMS.models.EventType;
import com.sindhuTRMS.models.Manager;


public class ManagerDAOImplTest {
	
	//this is the instance for the class which we are trying to test
ManagerDAOImpl managerDAOImplObj = new ManagerDAOImpl(); 
	
	@Test
	public void createmanager() {
		
		//to Setup  - Test data  
		Manager mng = new Manager();
		
		//mng.setManager_id(0);
		mng.setManager_firstname("Steven");
		mng.setManager_lastname("Speilberg");
		mng.setusername("steven01");
		mng.setpassword("password123");
		
		
		
		// call the methods we are testing
		
		
		assertNotNull(managerDAOImplObj.create(mng));
		
		
	}
	

}
