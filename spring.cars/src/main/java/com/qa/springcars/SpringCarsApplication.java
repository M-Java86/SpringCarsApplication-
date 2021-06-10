package com.qa.springcars;

import java.time.LocalTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.qa.springcars.controller.CarController;

@SpringBootApplication
public class SpringCarsApplication {

	public static void main(String[] args) {
		ApplicationContext beanbag = SpringApplication.run(SpringCarsApplication.class, args);
		
		// VERY SKETCHY - PLEASE DON'T USE IN YOUR APP
		System.out.println(beanbag.containsBean("greeting"));
		System.out.println(beanbag.containsBean("getCurrent"));
		
		CarController controller = beanbag.getBean(CarController.class);
		System.out.println(controller.sayHello());
		
	}

	
	
	//Bean- managed object 
	//meaning the creation, maintenance, and destruction of the object is All done by Spring 
	
	@Bean
	public String greeting() {
		return "Hello World";
	}
	
	@Bean
	public  LocalTime getCurrent() {
			return LocalTime.now();
	}
	
}
