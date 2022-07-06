package com.qa.may.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldSpring {

	// this will name the thing that goes out...so in postman -- http://localhost:8080/hello1 -- 
	// this sends it out, postman catches it with the name "/hello1" ...
	@GetMapping("/hello1")
	public String helloWorld() {
		String a = "Hello World! What you doing?";
		
		return a;
	}
	
}
