package com.qa.springcars.controller;

import org.springframework.web.bind.annotation.RestController;

public class CarController {

	@RestController
	public String sayHello() {
		return "Michelle says hi";
	}
}
