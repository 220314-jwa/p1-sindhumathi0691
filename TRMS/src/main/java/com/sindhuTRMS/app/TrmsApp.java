package com.sindhuTRMS.app;

import com.sindhuTRMS.data.DAOFactory;
import com.sindhuTRMS.data.DeptDAO;
import com.sindhuTRMS.data.EmployeeDAO;
import com.sindhuTRMS.data.EventTypeDAO;
import com.sindhuTRMS.data.ReimbDAO;
import com.sindhuTRMS.data.StatusDAO;
import com.sindhuTRMS.models.Department;
import com.sindhuTRMS.models.Employee;
import com.sindhuTRMS.models.EventType;
import com.sindhuTRMS.models.Reimb;
import com.sindhuTRMS.models.Status;

import io.javalin.Javalin;


public class TrmsApp {

		

	public static void main(String[] args) {
				
		Javalin app = Javalin.create().start(9090); 
	

	// POST request to add a DEPT
   //******************************************

		app.post("/createdept", ctx -> {
			// context bodyAsClass method will transform JSON data into
			// a Java object as long as the JSON keys match the Java fields
					
			Department newDept = ctx.bodyAsClass(Department.class);
			System.out.println(newDept);
						
			
			DeptDAO deptdao = DAOFactory.getDeptDAO();
			int id = deptdao.create(newDept);
			
			System.out.println("New DeptID created :" + id );
		
		
		});
		
		
		
		// POST request to create a STATUS
		//******************************************************
		
		app.post("/createStatus", ctx -> {
			// context bodyAsClass method will transform JSON data into
			// a Java object as long as the JSON keys match the Java fields
					
			Status newStatus = ctx.bodyAsClass(Status.class);
			System.out.println(newStatus);
			
			StatusDAO statusdao = DAOFactory.getStatusDAO();
			int id = statusdao.create(newStatus);
			
			System.out.println("New Status ID created :" + id );
			
//			try {
//				newPet = userServ.addNewPet(newPet);
//				ctx.json(newPet);
//			} catch (AlreadyAvailablePet e) {
//				ctx.status(HttpCode.CONFLICT); // 409 conflict
//			}
			
		});
		
		
	// POST request to create a EVENTTYPE
	//******************************************************
			
			app.post("/createEventType", ctx -> {
				// context bodyAsClass method will transform JSON data into
				// a Java object as long as the JSON keys match the Java fields
						
				EventType newEventType = ctx.bodyAsClass(EventType.class);
				System.out.println(newEventType);
				
				EventTypeDAO eventTypedao = DAOFactory.getEventTypeDAO();
				int id = eventTypedao.create(newEventType);
				
				System.out.println("New EventType ID created :" + id );
			
			
					
		   });
		
		
	// POST request to create an EMPLOYEE -- NOT YET READY
	//******************************************************
			
					app.post("/createEmployee", ctx -> {
						// context bodyAsClass method will transform JSON data into
						// a Java object as long as the JSON keys match the Java fields
								
						Employee newEmployee = ctx.bodyAsClass(Employee.class);
						System.out.println(newEmployee);
						
						EmployeeDAO employeedao = DAOFactory.getEmployeeDAO();
						int id = employeedao.create(newEmployee);
						
						System.out.println("New Employee ID created :" + id );
						
//						try {
//							newPet = userServ.addNewPet(newPet);
//							ctx.json(newPet);
//						} catch (AlreadyAvailablePet e) {
//							ctx.status(HttpCode.CONFLICT); // 409 conflict
//						}
						
						
					});
			
	// POST request to submit a REIMBURSEMENT -- NOT YET READY
	//******************************************************
			app.post("/submitReimb", ctx -> {
				// context bodyAsClass method will transform JSON data into
				// a Java object as long as the JSON keys match the Java fields
						
				Reimb newReimb = ctx.bodyAsClass(Reimb.class);
				System.out.println(newReimb);
				
				ReimbDAO reimbdao = DAOFactory.getReimbDAO();
				int id = reimbdao.create(newReimb);
				
				System.out.println("New Reimbursement ID created :" + id );
				
//				try {
//					newPet = userServ.addNewPet(newPet);
//					ctx.json(newPet);
//				} catch (AlreadyAvailablePet e) {
//					ctx.status(HttpCode.CONFLICT); // 409 conflict
//				}
				
				
			});
		
		
		
	}

	
	
}
