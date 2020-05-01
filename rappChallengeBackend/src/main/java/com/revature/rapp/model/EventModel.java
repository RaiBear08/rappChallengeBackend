package com.revature.rapp.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="tblevent")
public class EventModel implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="eventid")
	private int eventid;
	
	@Valid
	@NotBlank
	@Column(name="eventname")
	private String eventname;
	
	public String getEventlocation() {
		return eventlocation;
	}


	public void setEventlocation(String eventlocation) {
		this.eventlocation = eventlocation;
	}


	@Valid
	@NotBlank
	@Column(name="eventlocation")
	private String eventlocation;
	
	@Valid
	@NotBlank
	@Column(name="eventdate")
	private String eventdate;
	
	
	@Valid
	@NotBlank
	@Column(name="eventtime")
	private String eventtime;


	public int getEventid() {
		return eventid;
	}


	public void setEventid(int eventid) {
		this.eventid = eventid;
	}


	public String getEventname() {
		return eventname;
	}


	public void setEventname(String eventname) {
		this.eventname = eventname;
	}


	public String getEventdate() {
		return eventdate;
	}


	public void setEventdate(String eventdate) {
		this.eventdate = eventdate;
	}


	public String getEventtime() {
		return eventtime;
	}


	public void setEventtime(String eventtime) {
		this.eventtime = eventtime;
	}


	@Override
	public String toString() {
		return "eventModel [eventid=" + eventid + ", eventname=" + eventname + ", eventdate=" + eventdate
				+ ", eventtime=" + eventtime + "]";
	}
	
	
	
	
	
	
}
