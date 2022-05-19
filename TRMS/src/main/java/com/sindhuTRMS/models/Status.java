package com.sindhuTRMS.models;

public class Status {
	
	
	private int status_id;
	private String status_name;
	
	public Status() {
		
		this.status_id = 0;
		this.status_name="";
		
	}
	
	
	
	@Override
	public String toString() {
		return "Status [status_id=" + status_id + ", status_name=" + status_name + "]";
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + status_id;
		result = prime * result + ((status_name == null) ? 0 : status_name.hashCode());
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
		Status other = (Status) obj;

		
		if (status_id != other.status_id)
			return false;
		
					
		if (status_name == null) {
			if (other.status_name != null)
				return false;
		} else if (!status_name.equals(other.status_name))
			return false;
		

		return true;
			
	}

	
	
	
	
	public int getStatus_id() {
		return status_id;
	}

	public void setStatus_id(int status_id) {
		this.status_id = status_id;
	}

	public String getStatus_name() {
		return status_name;
	}

	public void setStatus_name(String status_name) {
		this.status_name = status_name;
	}


	
	
}


