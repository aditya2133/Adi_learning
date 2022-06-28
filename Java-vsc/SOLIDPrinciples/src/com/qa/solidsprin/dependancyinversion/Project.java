package com.qa.solidsprin.dependancyinversion;

import java.util.List;

public class Project {

	public List<Developer> developers; 
	
	
	// Constructors
	public Project() {
	}

// Constructor
	public Project (List<Developer> developers) {
		this.developers = developers;
		
	}
	
	
	
	// separate method to run
	public void something() {
	for( Developer devs: developers) {
		devs.writeCode();
	}
	
	}
	
		
		
	
	

//	// getters and setters
//	public String getDevelopers() {
//		return developers;
//	}
//
//
//	public void setDevelopers(String developers) {
//		this.developers = developers;
//	}
//	
	
	
}
