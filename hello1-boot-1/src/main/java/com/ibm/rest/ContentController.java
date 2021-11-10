package com.ibm.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.util.JSONPObject;

@RestController
public class ContentController {

	@GetMapping(value="/greet{name}", produces = "text/plain")
	public String greetText(@PathVariable String name) {
		return "Welcome to SpringBoot, " + name;
	}
	@GetMapping(value="/greet" , produces = "text/html")
	public String greetHtml(@RequestParam String name) {
		return "<h1>Welcome to SpringBoot, " + name +"</h1>";
	}
	
	@GetMapping(value="/greet" , produces = "text/xml")
	public String greetxml() {
		return "<?xml version=\"1.0\"><greeting>Welcome to SpringBoot</greeting>";
	}
	
	@GetMapping(value="/greet" , produces = "application/json")
	public String greetJson(){
		JSONPObject obj = new JSONPObject("greeting", "welcome to SpringBoot");
		return obj.toString();
	}
}
