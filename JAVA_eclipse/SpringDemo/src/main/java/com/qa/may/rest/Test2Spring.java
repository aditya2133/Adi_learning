package com.qa.may.rest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test2Spring {

	@GetMapping("/springtest")
	public String wassup() {
		
		String a = "Yo, ";
		String b = "Wassup dude?";
		String c = " Where you upto?";
		
		return a+b+c;
		
	}
	
	
}
