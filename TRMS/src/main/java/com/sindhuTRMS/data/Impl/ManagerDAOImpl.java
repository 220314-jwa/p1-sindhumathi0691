package com.sindhuTRMS.data.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.sindhuTRMS.data.EmployeeDAO;
import com.sindhuTRMS.data.ManagerDAO;
import com.sindhuTRMS.models.Employee;
import com.sindhuTRMS.models.Manager;
import com.sindhuTRMS.utils.ConnectionFactory;

public class ManagerDAOImpl implements ManagerDAO {
	
	private static ConnectionFactory connFactory = ConnectionFactory.getConnectionFactory();

	@Override
	public int create(Manager newObj) {
		
		Connection conn = connFactory.getConnection();
		try {
			String sql = "insert into manager (manager_id,manager_firstname,manager_lastname,username,password)"
					+ " values (default,?,?,?,?)";
			PreparedStatement pStmt = conn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
			
			//pStmt.setLong(1, newObj.getManager_id());
			pStmt.setString(1, newObj.getManager_firstname());
			pStmt.setString(2, newObj.getManager_lastname());
			pStmt.setString(3, newObj.getusername());
			pStmt.setString(4, newObj.getpassword());
		
		

			conn.setAutoCommit(false); // for ACID (transaction management)
			int count = pStmt.executeUpdate();
			ResultSet resultSet = pStmt.getGeneratedKeys();
			
			
			if (count > 0) {
                System.out.println("Manager added!");
                // return the generated id:
                // before we call resultSet.next(), it's basically pointing to nothing useful
                // but moving that pointer allows us to get the information that we want
                resultSet.next();
                int id = resultSet.getInt(1);
                newObj.setManager_id(id);
                conn.commit(); // commit the changes to the DB
            }
            // if 0 rows are affected, something went wrong:
            else {
                System.out.println("Something went wrong when trying to add Manager!");
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
		
			
//			if (resultSet.next()) {
//				newObj.setStatus_id(resultSet.getInt(1));
//				conn.commit();
//			} else {
//				conn.rollback();
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//			try {
//				conn.rollback();
//			} catch (SQLException e1) {
//				e1.printStackTrace();
//			}
//		} finally {
//			try {
//				conn.close();
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//		}

		return newObj.getManager_id();
		
		
	}

	

	@Override
	public Manager getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Manager> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Manager updatedObj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Manager objToDelete) {
		// TODO Auto-generated method stub
		
	}

	

}
