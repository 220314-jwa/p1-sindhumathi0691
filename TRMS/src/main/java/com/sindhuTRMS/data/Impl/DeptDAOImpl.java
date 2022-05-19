package com.sindhuTRMS.data.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.sindhuTRMS.data.DeptDAO;
import com.sindhuTRMS.models.Department;
import com.sindhuTRMS.utils.ConnectionFactory;

public class DeptDAOImpl implements DeptDAO {
	
	private static ConnectionFactory connFactory = ConnectionFactory.getConnectionFactory();


	@Override
	public int create(Department newObj) {
	
		Connection conn = connFactory.getConnection();
		try {
			String sql = "insert into department (dept_id, dept_name,dept_head_id)"
					+ " values (default,?,?)";
			PreparedStatement pStmt = conn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
			
			pStmt.setString(1, newObj.getDept_name());
			pStmt.setLong(2, newObj.getdept_head_id());

			conn.setAutoCommit(false); // for ACID (transaction management)
			int count = pStmt.executeUpdate();
			ResultSet resultSet = pStmt.getGeneratedKeys();
			
			
			if (count > 0) {
                System.out.println("Department added!");
                // return the generated id:
                // before we call resultSet.next(), it's basically pointing to nothing useful
                // but moving that pointer allows us to get the information that we want
                resultSet.next();
                int id = resultSet.getInt(1);
                newObj.setDept_id(id);
                conn.commit(); // commit the changes to the DB
            }
            // if 0 rows are affected, something went wrong:
            else {
                System.out.println("Something went wrong when trying to add Department!");
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

		return newObj.getDept_id();
		
		
		
	}

	@Override
	public Department getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public List<Department> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Department updatedObj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Department objToDelete) {
		// TODO Auto-generated method stub
		
	}

	
	
}
