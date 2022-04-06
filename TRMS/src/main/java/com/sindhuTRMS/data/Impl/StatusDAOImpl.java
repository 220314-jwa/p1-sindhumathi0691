package com.sindhuTRMS.data.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.sindhuTRMS.data.DeptDAO;
import com.sindhuTRMS.data.EventTypeDAO;
import com.sindhuTRMS.data.StatusDAO;
import com.sindhuTRMS.models.Department;
import com.sindhuTRMS.models.EventType;
import com.sindhuTRMS.models.Status;
import com.sindhuTRMS.utils.ConnectionFactory;

public class StatusDAOImpl implements StatusDAO {
	
	private static ConnectionFactory connFactory = ConnectionFactory.getConnectionFactory();

	@Override
	public int create(Status newObj) {
		
		
		Connection conn = connFactory.getConnection();
		
		try {
			//									0			1
			String sql = "insert into status (status_id, status_name)"
					+ " values (default,?)";
			PreparedStatement pStmt = conn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
			
			pStmt.setString(1, newObj.getStatus_name());


			conn.setAutoCommit(false); // for ACID (transaction management)
			int count = pStmt.executeUpdate();
			ResultSet resultSet = pStmt.getGeneratedKeys();
			
			
			if (count > 0) {
                System.out.println("Status added!");
                // return the generated id:
                // before we call resultSet.next(), it's basically pointing to nothing useful
                // but moving that pointer allows us to get the information that we want
                resultSet.next();
                int id = resultSet.getInt(1);
                newObj.setStatus_id(id);
                conn.commit(); // commit the changes to the DB
            }
            // if 0 rows are affected, something went wrong:
            else {
                System.out.println("Something went wrong when trying to add Status!");
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

		return newObj.getStatus_id();
		
		
		
	}

	@Override
	public Status getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Status> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Status updatedObj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Status objToDelete) {
		// TODO Auto-generated method stub
		
	}





	
	
}
