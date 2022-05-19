package com.sindhuTRMS.data.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.sindhuTRMS.data.DeptHeadDAO;
import com.sindhuTRMS.data.EmployeeDAO;
import com.sindhuTRMS.data.ManagerDAO;
import com.sindhuTRMS.models.DeptHead;
import com.sindhuTRMS.models.Employee;
import com.sindhuTRMS.models.Manager;
import com.sindhuTRMS.utils.ConnectionFactory;

public class DeptHeadDAOImpl implements DeptHeadDAO {
	
	private static ConnectionFactory connFactory = ConnectionFactory.getConnectionFactory();

	@Override
	public int create(DeptHead newObj) {
		
		Connection conn = connFactory.getConnection();
		try {
			String sql = "insert into deptHead (dept_head_id,dept_head_firstname,dept_head_lastname,username,password)"
					+ " values (default,?,?,?,?)";
			PreparedStatement pStmt = conn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
			
		
			pStmt.setString(1, newObj.getDeptHead_firstname());
			pStmt.setString(2, newObj.getDeptHead_lastname());
			pStmt.setString(3, newObj.getusername());
			pStmt.setString(4, newObj.getpassword());
		
		

			conn.setAutoCommit(false); // for ACID (transaction management)
			int count = pStmt.executeUpdate();
			ResultSet resultSet = pStmt.getGeneratedKeys();
			
			
			if (count > 0) {
                System.out.println("Dept Head added!");
                // return the generated id:
                // before we call resultSet.next(), it's basically pointing to nothing useful
                // but moving that pointer allows us to get the information that we want
                resultSet.next();
                int id = resultSet.getInt(1);
                newObj.setDeptHead_id(id);
                conn.commit(); // commit the changes to the DB
            }
            // if 0 rows are affected, something went wrong:
            else {
                System.out.println("Something went wrong when trying to add DeptHead!");
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

		return newObj.getDeptHead_id();
		
		
	}

	@Override
	public DeptHead getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<DeptHead> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(DeptHead updatedObj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(DeptHead objToDelete) {
		// TODO Auto-generated method stub
		
	}


	


	

}
