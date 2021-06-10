package com.qa.service;

import java.util.List;

import com.qa.springcars.domain.Car;

public class CarServiceList {

	// Here is where our logic will go 
	
	
	private List<Car> vehicles; // <--- dependency 
	
	public CarServiceList(List<Car>) vehicles) {
		this.vehicle = vehicles;
	}
	
}
