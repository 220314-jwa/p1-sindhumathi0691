
package com.sindhuTRMS.data.Impl;

import com.sindhuTRMS.utils.ConnectionFactory;
import com.sindhuTRMS.data.ReimbDAO;
import com.sindhuTRMS.models.Reimb;
//import com.sindhuTRMS.models.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// ide should let you auto-generate methods
public class ReimbDAOImpl implements ReimbDAO {
	private static ConnectionFactory connFactory = ConnectionFactory.getConnectionFactory();

	@Override
    // this method needs to insert the object into the database:
    // so, we need to connect to the database:
	
	
    public int create(Reimb newObj) {
		
		Connection connection = connFactory.getConnection();
		
        // this stores our sql command, that we would normally to DBeaver/command line
        //                             0   1     2        3            4    5
        String sql = "insert into pet (id, name, species, description, age, status_id)" +
                "values (default, ?, ?, ?, ?, ?)";

        try {
            // create a prepared statement, we pass in the sql command
            // also the flag "RETURN_GENERATED_KEYS" so we can get that id that is generated
            PreparedStatement preparedStatement = connection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            // set the fields:
//            preparedStatement.setString(1, newObj.getName());
//            preparedStatement.setString(2, newObj.getSpecies());
//            preparedStatement.setString(3, newObj.getDescription());
//            preparedStatement.setInt(4, newObj.getAge());
//           
            
            // shortcut for now, but we need the corresponding id for the status
            int status_id;
            
//            if (newObj.getStatus().equals("available")) {
//                status_id = 1;
//            }
//            else {
//                status_id = 2;
//            }
            
            
       //     preparedStatement.setInt(5, status_id);
            
            connection.setAutoCommit(false); // for tx management (ACID)
            // execute this command, return number of rows affected:
            int count = preparedStatement.executeUpdate();
            // lets us return the id that is auto-generated
            ResultSet resultSet = preparedStatement.getGeneratedKeys();
            // if we affected one or more rows:
            if (count > 0) {
                System.out.println("Pet added!");
                // return the generated id:
                // before we call resultSet.next(), it's basically pointing to nothing useful
                // but moving that pointer allows us to get the information that we want
                resultSet.next();
                int id = resultSet.getInt(1);
           //     newObj.setId(id);
                connection.commit(); // commit the changes to the DB
            }
            // if 0 rows are affected, something went wrong:
            else {
                System.out.println("Something went wrong when trying to add pet!");
                connection.rollback(); // rollback the changes
            }
        } catch (SQLException e){
            // print out what went wrong:
            e.printStackTrace();
            try {
				connection.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
        } finally {
        	try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
        }
        
       return newObj.getId();
    }


	@Override
	public Reimb getById(int id) {
		// TODO Auto-generated method stub
		return null;
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






   

	
	
}
