package com.qa.solidsprin.oc;

public class OCExerGreeter {
// now this class doesnt have to change!!
	// just add different classes with greetings and implement it... 
	// anything new that implements Greeting interface will pass through here!
	
	private OCExerGreeting greetings;   // instatiate an object without creating an object!
	
	
	// constructor
	public OCExerGreeter (OCExerGreeting greetings) {
		this.greetings = greetings;
		
	}

		// getters and setter
	public OCExerGreeting getGreetings() {
		return greetings;
	}

	public void setGreetings(OCExerGreeting greetings) {
		this.greetings = greetings;
	}

	// implement greeting -- this gets run in the runner
	public String greeting() {
		return this.greetings.greeting();
		// first greetings - refers to the attribute
	}
	
	
	
}
