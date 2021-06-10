package com.qa.springcars.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Allow eternal access to our application via HTTPSRequests
public class CarController {

	
        @GetMapping("/hello") //@TypeofRequest("location)
		String sayHi() {
			return "Hello, World";
			
		}
        
        //List - Create a new Car - Add a Car to a List 
        // Read a car from a list 
        // Update a car 
        // Delete a car 
	}

