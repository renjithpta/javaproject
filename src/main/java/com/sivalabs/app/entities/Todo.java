package com.sivalabs.app.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class Todo {
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String description;
	@Temporal(TemporalType.TIMESTAMP)
	private Date date  = new Date();
	public Todo(Integer id, String description, Date date) {
		super();
		this.id = id;
		this.description = description;
		this.date = date;
	}
	public Todo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	

}
