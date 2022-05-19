package com.sindhuTRMS.models;

public class EventType {
	
	
	private int event_type_id;
	private String event_type_name;
	
	public EventType() {
		
		this.event_type_id = 0;
		this.event_type_name="";
		
	}
	
	
	
	@Override
	public String toString() {
		return "EventType [event_type_id=" + event_type_id + ", event_type_name=" + event_type_name + "]";
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + event_type_id;
		result = prime * result + ((event_type_name == null) ? 0 : event_type_name.hashCode());
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
		EventType other = (EventType) obj;

		
		if (event_type_id != other.event_type_id)
			return false;
		
					
		if (event_type_name == null) {
			if (other.event_type_name != null)
				return false;
		} else if (!event_type_name.equals(other.event_type_name))
			return false;
		

		return true;
			
	}

	
	
	
	
	public int getevent_type_id() {
		return event_type_id;
	}

	public void setevent_type_id(int event_type_id) {
		this.event_type_id = event_type_id;
	}

	public String getevent_type_name() {
		return event_type_name;
	}

	public void setevent_type_name(String event_type_name) {
		this.event_type_name = event_type_name;
	}


	
	
}


