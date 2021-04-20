package com.springrest.springrest.entities;

import javax.persistence.Entity;
import javax.persistence.Id;




@Entity
public class Courses {
	
	

	@Id
	private long id;
	private String title;
	private String details;
	public Courses(long id, String title, String details) {
		super();
		this.id = id;
		this.title = title;
		this.details = details;
	}
	public Courses() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	@Override
	public String toString() {
		return "Courses [id=" + id + ", title=" + title + ", details=" + details + ", getId()=" + getId()
				+ ", getTitle()=" + getTitle() + ", getDetails()=" + getDetails() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	

}
