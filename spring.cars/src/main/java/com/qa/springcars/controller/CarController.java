package com.qa.springcars.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.springcars.domain.Car;

@RestController //Allow eternal access to our application via HTTPSRequests
public class CarController {

	
        @GetMapping("/hello") //@TypeofRequest("location)
		String sayHi() {
			return "Hello, World";
			
		}
        
        private List<Car> vehicles = new ArrayList<>();
        
        //CRUD Operations
        //List - Create a new Car - Add a Car to a List 
        // Read a car from a list 
        // Update a car 
        // Delete a car 
        
        // CREATE
        
        @PostMapping("/create")
        public String createVehicle(Car car) {
        	this.vehicles.add(car);
        	return "Successfully Added Car";
        	
        }
	}

