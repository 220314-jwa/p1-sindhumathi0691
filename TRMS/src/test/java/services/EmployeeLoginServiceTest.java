package services;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mockito.junit.jupiter.MockitoExtension;
import java.sql.SQLException;
import org.mockito.InjectMocks;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.sindhuTRMS.data.EmployeeDAO;
import com.sindhuTRMS.data.EventTypeDAO;
import com.sindhuTRMS.data.StatusDAO;
import com.sindhuTRMS.data.Impl.EmployeeDAOImpl;
import com.sindhuTRMS.exceptions.IncorrectCredentialsException;
import com.sindhuTRMS.models.Employee;

@ExtendWith(MockitoExtension.class)
public class EmployeeLoginServiceTest {
	@Mock
	private EventTypeDAO eventtypeDao;
	@Mock
	private StatusDAO statusDao;
	@InjectMocks
	private  EmployeeDAOImpl employeeDAOImplObj = new EmployeeDAOImpl(); 
	
	
	
	
//	****************Mockito********************************
//	@Test 
//	public Employee logIn(String username, String password) throws IncorrectCredentialsException {
//		String Username ="sindhumathi";
//		String password1 ="pass1234";
//       Employee mockUser = new Employee();
//		mockUser.setusername(Username);
//		mockUser.setpassword(password1);
//		when(EmployeeDAO.getByUsername(Username)).thenReturn(mockUser);
//		Employee employee = EmployeeDAO.getByUsername(username);
//		Employee result=Employee.logIn(username,password1);
//	//	assertEquals(username,result.getUsername());
//		
//	}
	
	
	
	
		
}