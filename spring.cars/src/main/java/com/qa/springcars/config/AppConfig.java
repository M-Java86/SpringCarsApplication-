package com.qa.springcars.config;

import java.time.LocalTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;


@Configuration
public class AppConfig {
	
	@Bean
	@Scope("prototype") // create multiple instances of it 
	public String sayHello() {
		return "Michelle says hi";
}
	
	public  LocalTime getCurrent() {
		return LocalTime.now();

}

}
