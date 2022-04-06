package com.sindhuTRMS.models;

import java.sql.Time;
import java.time.LocalDate;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

// Java Bean:
// 1. fully encapsulated (private fields + getters/setters)
// 2. has a no-args constructor
// 3. implements Serializable (this one is outdated so I'm not including it below)

//@JsonIgnoreProperties(ignoreUnknown = true)
//@JsonFormat(pattern="yyyy-MM-dd'T'HH:mm:ss")

@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-mm-dd")

public class Reimb {
	
	private String first_name; 
	private String last_name; 
	private String event_type_name; 
	//private Date event_date = new Date();
	//private LocalDate event_date ;
	private String event_date ;
	private Double cost;
	private String description;
	private String location;
	
	
	//private Time submitted_at;
	
	

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




	public String getEvent_type_name() {
		return event_type_name;
	}




	public void setEvent_type_name(String event_type_name) {
		this.event_type_name = event_type_name;
	}




	public String getEvent_date() {
		return event_date;
	}




	public void setEvent_date(String event_date) {
		this.event_date = event_date;
	}




	public Double getCost() {
		return cost;
	}




	public void setCost(Double cost) {
		this.cost = cost;
	}




	public String getDescription() {
		return description;
	}




	public void setDescription(String description) {
		this.description = description;
	}




	public String getLocation() {
		return location;
	}




	public void setLocation(String location) {
		this.location = location;
	}




//	public Time getSubmitted_at() {
//		return submitted_at;
//	}


//	public void setSubmitted_at(Time submitted_at) {
//		this.submitted_at = submitted_at;
//	}




	public Reimb() {
		
		first_name = "";
		last_name = "";
		event_type_name="";
		event_date=null;
		cost=null;		
		description = "";
		location = "";
		//submitted_at=null;
					
	}
		
	

		
	@Override
	public String toString() {
		
				
//		return "Reimb [first_name=" + first_name + ", last_name =" + last_name + ",  event_type_name ="
//		+ event_type_name  + ", event_date =" + event_date  + ",  cost=" + cost+ ", description="
//				+ description + ", location="+ location + ", submitted_at= "+ submitted_at + "]";
		
		
		return "Reimb [first_name=" + first_name + ", last_name =" + last_name + ",  event_type_name ="
		+ event_type_name  + ", event_date =" + event_date  + ",  cost=" + cost+ ", description="
				+ description + ", location="+ location + "]";
		
				
	}
	

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((first_name == null) ? 0 : first_name.hashCode());;
		result = prime * result + ((last_name == null) ? 0 : last_name.hashCode());;
		result = prime * result + ((event_type_name == null) ? 0 : event_type_name.hashCode());;
		result = prime * result + ((event_date == null) ? 0 : event_date.hashCode());;
		result = prime * result + ((cost == null) ? 0 : cost.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		//result = prime * result + ((submitted_at == null) ? 0 : submitted_at.hashCode());
		
		
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
		Reimb other = (Reimb) obj;
		
	
		
		if (first_name == null) {
			if (other.first_name != null)
				return false;
		} else if (!first_name.equals(other.first_name))
			return false;
		
		
		if (last_name == null) {
			if (other.last_name != null)
				return false;
		} else if (!last_name.equals(other.last_name))
			return false;
		
		

		if (event_type_name == null) {
			if (other.event_type_name != null)
				return false;
		} else if (!event_type_name.equals(other.event_type_name))
			return false;
		
		
		
		if (event_date == null) {
			if (other.event_date != null)
				return false;
		} else if (!event_date.equals(other.event_date))
			return false;
		
		
		if (cost == null) {
			if (other.cost != null)
				return false;
		} else if (!cost.equals(other.cost))
			return false;
		
		
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		

		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		
		
//		if (submitted_at == null) {
//			if (other.submitted_at != null)
//				return false;
//		} else if (!submitted_at.equals(other.submitted_at))
//			return false;
//		
				
		return true;
	}

}
