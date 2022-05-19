package com.sindhuTRMS.models;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Currency;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

// Java Bean:
// 1. fully encapsulated (private fields + getters/setters)
// 2. has a no-args constructor
// 3. implements Serializable (this one is outdated so I'm not including it below)

//@JsonIgnoreProperties(ignoreUnknown = true)
//@JsonFormat(pattern="yyyy-MM-dd'T'HH:mm:ss")

//@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-mm-dd")

public class Reimb {
	
	private int request_id;
	private int employee_id;
	private int event_type_id;
	private int status_id;
	private String event_date ;
	private int cost;
	private String description;
	private String location;
	private String submitted_at;
	private String comments;
	private List<Reimb> reimb;
	
	

	public Reimb() {
		
		request_id = 0;
		employee_id=0;
		event_type_id=0;
		status_id=0;
		event_date="";
		cost=0;		
		description = "";
		location = "";
		submitted_at="";
		comments="";
		reimb = new ArrayList<>();
					
	}
		
	

		
	@Override
	public String toString() {
		


		return "Reimb [request_id=" + request_id + ", employee_id =" + employee_id + ",  event_type_id ="
		+ event_type_id  + ", status_id =" + status_id  + ",event_date= " + event_date + ",cost=" + cost+ ", description="
				+ description + ", location="+ location + ",submitted_at="+ submitted_at +",comments=" + comments +"]";
		
				
	}
	

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + request_id;
		result = prime * result + employee_id;
		result = prime * result + event_type_id;
		result = prime * result + status_id;
		result = prime * result + ((event_date == null) ? 0 : event_date.hashCode());
		result = prime * result + cost;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((submitted_at == null) ? 0 : submitted_at.hashCode());
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((comments == null) ? 0 : comments.hashCode());
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
		
	
		

		if (request_id != other.request_id)
			return false;
		
		if (employee_id != other.employee_id)
			return false;
		
		if (event_type_id != other.event_type_id)
			return false;
		
		if (status_id != other.status_id)
			return false;
		
		
		if (event_date == null) {
			if (other.event_date != null)
				return false;
		} else if (!event_date.equals(other.event_date))
			return false;
		
		
		if (cost != other.cost)
			return false;
		

		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		
		
		
		if (submitted_at == null) {
			if (other.submitted_at != null)
				return false;
		} else if (!submitted_at.equals(other.submitted_at))
			return false;
		
		
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		

		
		if (comments == null) {
			if (other.comments != null)
				return false;
		} else if (!comments.equals(other.comments))
			return false;
		


				
		return true;
	}
	
	
	//****************************************GETTER & SETTER Methods ********************************************************
	
	public int getRequest_id() {
		return request_id;
	}




	public void setRequest_id(int request_id) {
		this.request_id = request_id;
	}




	public int getEmployee_id() {
		return employee_id;
	}




	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}




	public int getEvent_type_id() {
		return event_type_id;
	}




	public void setEvent_type_id(int event_type_id) {
		this.event_type_id = event_type_id;
	}




	public int getStatus_id() {
		return status_id;
	}




	public void setStatus_id(int status_id) {
		this.status_id = status_id;
	}




	public String getEvent_date() {
		return event_date;
	}




	public void setEvent_date(String event_date) {
		this.event_date = event_date;
	}




	public int getCost() {
		return cost;
	}




	public void setCost(int cost) {
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




	public String getSubmitted_at() {
		return submitted_at;
	}




	public void setSubmitted_at(String submitted_at) {
		this.submitted_at = submitted_at;
	}




	public String getComments() {
		return comments;
	}




	public void setComments(String comments) {
		this.comments = comments;
	}




	public List<Reimb> getReimb() {
		return reimb;
	}




	public void setReimb(List<Reimb> reimb) {
		this.reimb = reimb;
	}
	

}
