package com.sindhuTRMS.data;

import com.sindhuTRMS.data.Impl.DeptDAOImpl;
import com.sindhuTRMS.data.Impl.EmployeeDAOImpl;
import com.sindhuTRMS.data.Impl.EventTypeDAOImpl;
import com.sindhuTRMS.data.Impl.ReimbDAOImpl;
import com.sindhuTRMS.data.Impl.StatusDAOImpl;


// this class is responsible for instantiating/returning dao
public class DAOFactory {
    // initialize our pet dao to be null
    // keep static instances of our DAOs
    // save memory, etc.
    private static ReimbDAO ReimbDAO = null;
    private static DeptDAO DeptDAO = null;
    private static EmployeeDAO EmployeeDAO = null;
    private static EventTypeDAO EventTypeDAO = null;
    private static StatusDAO StatusDAO = null;
    

    // make our constructor private, so it can't be accessed publicly
    private DAOFactory() { }

    public static ReimbDAO getReimbDAO() {
        // make sure we're not recreating the dao if it already exists:
        if (ReimbDAO == null) {
        	ReimbDAO = new ReimbDAOImpl();
        }
        return ReimbDAO;
    }
    
    public static DeptDAO getDeptDAO() {
    	if (DeptDAO == null)
    		DeptDAO = new DeptDAOImpl();
    	return DeptDAO;
    }
    
    
    public static EmployeeDAO getEmployeeDAO() {
    	if (EmployeeDAO == null)
    		EmployeeDAO = new EmployeeDAOImpl();
    	return EmployeeDAO;
    }
    
    
    public static EventTypeDAO getEventTypeDAO() {
    	if (EventTypeDAO == null)
    		EventTypeDAO = new EventTypeDAOImpl();
    	return EventTypeDAO;
    }
    
    
    public static StatusDAO getStatusDAO() {
    	if (StatusDAO == null)
    		StatusDAO = new StatusDAOImpl();
    	return StatusDAO;
    }
    
    
    
}
