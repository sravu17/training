package com.ibm.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
	
	@GetMapping(value="/hello")
	public String saHello() {
		return "Hello Spring Boot";
	}

}
