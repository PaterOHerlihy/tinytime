package de.pater.tinytime;

import java.sql.Time;
import java.text.DateFormat;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Activity {

	private @Id @GeneratedValue Long id;
	private Date start;
	private Date end;
	private Time duration;
	
	Activity(){
		
	}
	
	public Activity(long id, Date start, Date end, Time duration) {
		super();
		this.id = id;
		this.start = start;
		this.end = end;
		this.duration = duration;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Date getStart() {
		return start;
	}
	public void setStart(Date start) {
		this.start = start;
	}
	public Date getEnd() {
		return end;
	}
	public void setEnd(Date end) {
		this.end = end;
	}
	public Time getDuration() {
		return duration;
	}
	public void setDuration(Time duration) {
		this.duration = duration;
	}
	
	
	
}
