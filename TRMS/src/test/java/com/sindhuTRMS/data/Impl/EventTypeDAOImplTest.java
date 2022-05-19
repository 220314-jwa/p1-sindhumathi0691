package com.sindhuTRMS.data.Impl;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import com.sindhuTRMS.models.EventType;


public class EventTypeDAOImplTest {
	
	//this is the instance for the class which we are trying to test
EventTypeDAOImpl EventTypeDAOImplObj = new EventTypeDAOImpl(); 
	
	@Test
	public void createeventtype() {
		
		//to Setup  - Test data  
		EventType e = new EventType();
		
		//e.setevent_type_id(1);
		e.setevent_type_name("Team lunch");
				
		// call the methods we are testing
		
		
		assertNotNull(EventTypeDAOImplObj.create(e));
		
		
	}
	

	
//	@Test
//	public void getByEventTypeIdExists() {
//		int id = testEventType.getEventTypeId();
//		EventType eventType = eventTypeDAO.getById(id);
//		assertEquals(testEventType, eventType);
//	}
	
	
	
	
	
	
	
	
	
	
}
