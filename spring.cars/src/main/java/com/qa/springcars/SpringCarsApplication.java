package com.qa.springcars;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringCarsApplication {

	public static void main(String[] args) {
		ApplicationContext beanbag = SpringApplication.run(SpringCarsApplication.class, args);
		
		System.out.println(beanbag.containsBean("greeting"));
	}

	
	
	//Bean- managed object 
	//meaning the creation, maintenance, and destruction of the object is ALL done by Spring 
	
	@Bean
	public String greeting() {
		return "Hello World";
	}
	
}
