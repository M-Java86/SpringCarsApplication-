package com.qa.springcars;

import java.time.LocalTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringCarsApplication {

	public static void main(String[] args) {
	ApplicationContext beanBag = SpringApplication.run(SpringCarsApplication.class, args);
	
	beanBag.containsBean("getCurrent");
	
	}
	
	//@Bean
	//public String greeting() {
		//return "Hello, World";
	//}
	
	@Bean
	public LocalTime getCurrent() {
		return LocalTime.now();

}
	
	}


//Bean - managed object 
//meaning the creation, maintenance, and destruction of the object is ALL done by Spring