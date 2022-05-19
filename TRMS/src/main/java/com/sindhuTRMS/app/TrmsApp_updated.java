package com.sindhuTRMS.app;

import com.sindhuTRMS.data.DAOFactory;
import com.sindhuTRMS.data.DeptDAO;
import com.sindhuTRMS.data.DeptHeadDAO;
import com.sindhuTRMS.data.EmployeeDAO;
import com.sindhuTRMS.data.EventTypeDAO;
import com.sindhuTRMS.data.ManagerDAO;
import com.sindhuTRMS.data.ReimbDAO;
import com.sindhuTRMS.data.StatusDAO;
import com.sindhuTRMS.models.Department;
import com.sindhuTRMS.models.DeptHead;
import com.sindhuTRMS.models.Employee;
import com.sindhuTRMS.models.EventType;
import com.sindhuTRMS.models.Manager;
import com.sindhuTRMS.models.Reimb;
import com.sindhuTRMS.models.Status;



import io.javalin.Javalin;


public class TrmsApp_updated {

		

	public static void main(String[] args) {
				
		Javalin app = Javalin.create(config -> {
			config.enableCorsForAllOrigins();
		});
		
		app.start();
				
		app.routes(() -> {
			path("/requests", () -> {
				post(RequestsController::submitReimbursementRequest);
				path("/requestor/{id}", () -> {
					get(RequestsController::getRequestsByRequestor);
				});
				path("/approver/{id}", () -> {
					get(RequestsController::getRequestsByApprover);
				});
				path("/approve", () -> {
					post(RequestsController::approveRequest);
				});
				path("/reject", () -> {
					post(RequestsController::rejectRequest);
				});
				path("/options", () -> {
					get(RequestsController::getOptions);
				});
			});
			
			path("/users", () -> {
				path("/auth", () -> {
					post(UsersController::logIn);
				});
				path("/{id}", () -> {
					get(UsersController::getUserById);
					
					path("/auth", () -> {
						get(UsersController::checkLogin);
					});
				});
				
			});
		});
		
	


			
			
			
			
		
	}

	
	
}
