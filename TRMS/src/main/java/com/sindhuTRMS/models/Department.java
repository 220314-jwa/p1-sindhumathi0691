package com.sindhuTRMS.models;

public class Department {

	private int dept_head_id;
	private int dept_id;
	private String dept_name;
	
	
	public Department() {
		
		dept_head_id=0;
		dept_id=0;
		dept_name="";
				
	}
	
	
	@Override
	public String toString() {
		return "Department [dept_head_id=" + dept_head_id + ", dept_id=" + dept_id + ", dept_name=" + dept_name + "]";
	}
	
	

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + dept_head_id;
	result = prime * result + dept_id;
	result = prime * result + ((dept_name == null) ? 0 : dept_name.hashCode());
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
	Department other = (Department) obj;

	
	if (dept_head_id != other.dept_head_id)
		return false;
	
	if (dept_id != other.dept_id)
		return false;
		
	if (dept_name == null) {
		if (other.dept_name != null)
			return false;
	} else if (!dept_name.equals(other.dept_name))
		return false;
	

	return true;
		
}

	
	
	
	public int getdept_head_id() {
		return dept_head_id;
	}
	public void setdept_head_id(int dept_head_id) {
		this.dept_head_id = dept_head_id;
	}
	public int getDept_id() {
		return dept_id;
	}
	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}
	public String getDept_name() {
		return dept_name;
	}
	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}
	
}
