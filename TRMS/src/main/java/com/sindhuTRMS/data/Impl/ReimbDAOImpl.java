
package com.sindhuTRMS.data.Impl;

import com.sindhuTRMS.utils.ConnectionFactory;
import com.sindhuTRMS.data.ReimbDAO;
import com.sindhuTRMS.models.Reimb;
//import com.sindhuTRMS.models.User;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// ide should let you auto-generate methods
public class ReimbDAOImpl implements ReimbDAO {
	private static ConnectionFactory connFactory = ConnectionFactory.getConnectionFactory();

	//@Override
    // this method needs to insert the object into the database:
    // so, we need to connect to the database:
	
	Connection conn = connFactory.getConnection();
	
    public int create(Reimb newObj) {
		
		
		
        // this stores our sql command, that we would normally to DBeaver/command line
        //                            						 0   		1     		2       		 3            4    	5     6           7        8            9
      

        try {
        	
        	  String sql = "insert into reimbursement_request (request_id, employee_id, event_type_id, status_id, event_date, cost,description,location,submitted_at,comments)" +
                      "values (default, ?, ?, ?, ?, ?,?,?,?,?)";
        	  
            // create a prepared statement, we pass in the sql command
            // also the flag "RETURN_GENERATED_KEYS" so we can get that id that is generated
            PreparedStatement pStmt = conn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            
            // set the fields:
            pStmt.setLong(1, newObj.getEmployee_id());
            pStmt.setLong(2, newObj.getEvent_type_id());
            pStmt.setLong(3, newObj.getStatus_id());
            
            
           pStmt.setString(4, newObj.getEvent_date());
           pStmt.setString(8, newObj.getSubmitted_at());
            
            
            //pStmt.setDate(4, new java.sql.Date(newObj.getEvent_date().getTime()));
            //pStmt.setDate(8, new java.sql.Date(newObj.getSubmitted_at().getTime()));
        	//pStmt.setDate(4, (Date) newObj.getEvent_date());     
            //pStmt.setDate(4, Date.valueOf(dateToAdd.getEvent_date())); 
            // pStmt.setTime(8,(Time) newObj.getSubmitted_at());
            
            pStmt.setInt(5, newObj.getCost());
            pStmt.setString(6, newObj.getDescription());
            pStmt.setString(7, newObj.getLocation());
            
          
            
            pStmt.setString(9, newObj.getComments());
           
        	conn.setAutoCommit(false); // for ACID (transaction management)
			int count = pStmt.executeUpdate();
			ResultSet resultSet = pStmt.getGeneratedKeys();
			
			
			if (count > 0) {
                System.out.println("Reimbursement added!");
                // return the generated id:
                // before we call resultSet.next(), it's basically pointing to nothing useful
                // but moving that pointer allows us to get the information that we want
                resultSet.next();
                int id = resultSet.getInt(1);
                newObj.setRequest_id(id);
                conn.commit(); // commit the changes to the DB
            }
            // if 0 rows are affected, something went wrong:
            else {
                System.out.println("Something went wrong when trying to add Reimbursement!");
                conn.rollback(); // rollback the changes
            }
        } catch (SQLException e){
            // print out what went wrong:
            e.printStackTrace();
            try {
            	conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
        } finally {
        	try {
        		conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
        }

       return newObj.getRequest_id();
    }


	@Override
	public Reimb getById(int id) {
		
		Reimb reimb = null;
		
	
		
		String sql = "SELECT reimbursement_request.request_id,reimbursement_request.cost,reimbursement_request.description, reimbursement_request.location," +
				     " reimbursement_request.submitted_at, reimbursement_request.comments,employee.first_name,employee.last_name,event_type.event_type_name,status.status_name  FROM reimbursement_request" +
					 " Inner join employee ON reimbursement_request.employee_id = employee.employee_id" +
				     " Inner join event_type ON reimbursement_request.event_type_id = event_type.event_type_id" +
					 " Inner join status ON reimbursement_request.status_id = status.status_id" +
				     " WHERE reimbursement_request.request_id = ?";
				
				
		
		try
		
		{
			PreparedStatement preparedStatement = conn.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next()) {
				reimb = parseResultSet(resultSet);
			}else {
				System.out.println("Something went wrong");
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return reimb;
		
		
		
		
	}


	@Override
	public List<Reimb> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Reimb updatedObj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Reimb objToDelete) {
		// TODO Auto-generated method stub
		
	}

	
	private Reimb parseResultSet(ResultSet resultSet) throws SQLException{
		Reimb reimb = new Reimb();
		reimb.setEmployee_id(resultSet.getInt(1));
		reimb.setEvent_type_id(resultSet.getInt(2));
		reimb.setStatus_id(resultSet.getInt(3));
		//reimb.setEvent_date(resultSet.getString(4));
		reimb.setCost(resultSet.getInt(4));
		reimb.setDescription(resultSet.getString(5));
		reimb.setLocation(resultSet.getString(6));
		reimb.setSubmitted_at(resultSet.getString(7));
		reimb.setComments(resultSet.getString(8));
		return reimb;

	}
	





   

	
	
}
