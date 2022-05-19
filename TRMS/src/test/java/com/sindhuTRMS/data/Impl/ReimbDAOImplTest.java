package com.sindhuTRMS.data.Impl;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import com.sindhuTRMS.models.EventType;
import com.sindhuTRMS.models.Reimb;


public class ReimbDAOImplTest {
	
	//this is the instance for the class which we are trying to test
ReimbDAOImpl reimbDAOImplObj = new ReimbDAOImpl(); 
	
	@Test
	public void createreimb() {
		
		//to Setup  - Test data  
		Reimb re = new Reimb();
		
		//re.setRequest_id(2);
		re.setEmployee_id(4);
		re.setEvent_type_id(4);
		re.setStatus_id(4);
		re.setEvent_date("04-15-2022");
		re.setCost(300);
		re.setSubmitted_at("12:00");
		re.setDescription("Trian Tickets to team");
		
		// call the methods we are testing
		
		
		assertNotNull(reimbDAOImplObj.create(re));
		
		
	}
	

}
