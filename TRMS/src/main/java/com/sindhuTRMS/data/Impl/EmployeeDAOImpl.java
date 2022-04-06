package com.sindhuTRMS.data.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.sindhuTRMS.data.EmployeeDAO;
import com.sindhuTRMS.models.Employee;
import com.sindhuTRMS.utils.ConnectionFactory;

public class EmployeeDAOImpl implements EmployeeDAO {
	
	private static ConnectionFactory connFactory = ConnectionFactory.getConnectionFactory();

	@Override
	public int create(Employee newObj) {
		
		Connection conn = connFactory.getConnection();
		try {
			String sql = "insert into employee (employee_id,first_name,last_name, manager_id,dept_id)"
					+ " values (default,?,?,?,?)";
			PreparedStatement pStmt = conn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
			
			pStmt.setString(1, newObj.getFirst_name());
			pStmt.setString(2, newObj.getLast_name());
			pStmt.setLong(3, newObj.getManager_id());
			pStmt.setLong(4, newObj.getDept_id());

			conn.setAutoCommit(false); // for ACID (transaction management)
			int count = pStmt.executeUpdate();
			ResultSet resultSet = pStmt.getGeneratedKeys();
			
			
			if (count > 0) {
                System.out.println("Employee added!");
                // return the generated id:
                // before we call resultSet.next(), it's basically pointing to nothing useful
                // but moving that pointer allows us to get the information that we want
                resultSet.next();
                int id = resultSet.getInt(1);
                newObj.setEmployee_id(id);
                conn.commit(); // commit the changes to the DB
            }
            // if 0 rows are affected, something went wrong:
            else {
                System.out.println("Something went wrong when trying to add Employee!");
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

		return newObj.getEmployee_id();
		
		
	}

	@Override
	public Employee getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Employee updatedObj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Employee objToDelete) {
		// TODO Auto-generated method stub
		
	}

}
