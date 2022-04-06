package com.sindhuTRMS.models;

import java.util.ArrayList;
import java.util.List;



public class Employee {

	private int employee_id;
	private int manager_id;
	private int dept_id;
	private String first_name;
	private String last_name;
	private List<Reimb> reimb;
	
	
public Employee() {
		
		employee_id=0;
		manager_id=0;
		dept_id=0;
		first_name="";
		last_name="";
		reimb = new ArrayList<>();
	
	}
	

@Override
public String toString() {
	return "Employee [employee_id=" + employee_id + ", manager_id=" + manager_id + ", dept_id=" + dept_id + ", first_name=" + first_name
			+ ", last_name=" + last_name + ", reimb=" + reimb + "]";
}



@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + employee_id;
	result = prime * result + manager_id;
	result = prime * result + dept_id;
	result = prime * result + ((first_name == null) ? 0 : first_name.hashCode());
	result = prime * result + ((last_name == null) ? 0 : last_name.hashCode());
	result = prime * result + ((reimb == null) ? 0 : reimb.hashCode());
	
	return result;
}


@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	
	if (getClass() != obj.getClass())
		return false;
	Employee other = (Employee) obj;
	
	if (first_name == null) {
		if (other.first_name != null)
			return false;
	} else if (!first_name.equals(other.first_name))
		return false;
	
	if (employee_id != other.employee_id)
		return false;
	
	if (manager_id != other.manager_id)
		return false;
	
	if (dept_id != other.dept_id)
		return false;
	
	
	if (last_name == null) {
		if (other.last_name != null)
			return false;
	} else if (!last_name.equals(other.last_name))
		return false;
	
		
	if (reimb == null) {
		if (other.reimb != null)
			return false;
	} else if (!reimb.equals(other.reimb))
		return false;
	

	
	return true;
	
	
}

	
	
	public int getEmployee_id() {
		return employee_id;
	}


	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}


	public int getManager_id() {
		return manager_id;
	}


	public void setManager_id(int manager_id) {
		this.manager_id = manager_id;
	}


	public int getDept_id() {
		return dept_id;
	}


	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}


	public String getFirst_name() {
		return first_name;
	}


	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}


	public String getLast_name() {
		return last_name;
	}


	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}


	public List<Reimb> getReimb() {
		return reimb;
	}


	public void setReimb(List<Reimb> reimb) {
		this.reimb = reimb;
	}


	
	
	

	
	
	
	
}
