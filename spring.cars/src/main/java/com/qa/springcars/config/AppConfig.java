package com.qa.springcars.config;

import java.time.LocalTime;
import org.springframework.context.annotation.Configuration;


@Configuration
public class AppConfig {
	
	public String sayHello() {
		return "Michelle says hi";
}
	
	public  LocalTime getCurrent() {
		return LocalTime.now();

}

}
