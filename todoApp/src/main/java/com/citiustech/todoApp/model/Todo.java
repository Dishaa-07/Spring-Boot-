package com.citiustech.todoApp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Todo {
	@Id
	private long id;
	private String description;
	private int priority;
	
	
	
	public Todo() {
		
		
	}



	public Todo(long id, String description, int priority) {
		this.id = id;
		this.description = description;
		this.priority = priority;
	}



	
	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public int getPriority() {
		return priority;
	}



	public void setPriority(int priority) {
		this.priority = priority;
	}



	@Override
	public String toString() {
		return "Todo [id=" + id + ", description=" + description + ", priority=" + priority + "]";
	}
	
	
	
	
}
