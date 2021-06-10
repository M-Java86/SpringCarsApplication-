package com.qa.springcars.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // Marks as Table 
public class Car {
	
	@Id //PK-Primary Key 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	//private- they can only be seen in the car class , interact with these attributes outside the car class
	//getters and setters
	private String Make;
	private String model;
	private int year;
	private int doors;
	
	//Default Constructor 
	public Car() {
		
	}
	
	
	
	// Constructor 
	public Car(String make, String model, int year, int doors) {
		super();
		Make = make;
		this.model = model;
		this.year = year;
		this.doors = doors;
		
	}
	
	// getters and setters - interact with attributes 
	public String getMake() {
		return Make;
	}
	public void setMake(String make) {
		Make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getDoors() {
		return doors;
	}
	public void setDoors(int doors) {
		this.doors = doors;
	}
	
	

}
