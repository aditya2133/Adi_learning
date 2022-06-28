package com.qa.solidsprin.oc;

public class Runner {

	
	public static void main(String[] args) {
	OCExerFormalGreeting fg = new OCExerFormalGreeting(); // objects created to pass particular greeter
	OCExerCasualGreeting cg = new OCExerCasualGreeting();
	
		OCExerGreeter formalGreet = new OCExerGreeter(fg); // passing object into Greeter to run it through there!
		OCExerGreeter casualGreet = new OCExerGreeter(cg); // these are the constructors with inputs
		
		System.out.println(formalGreet.greeting());		
		System.out.println(casualGreet.greeting());
		
		
	}
}
