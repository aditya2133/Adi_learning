package com.qa.classconstructorexample.copy;

public class Runner {

	public static void main(String[] args) {
		
		//creating empty object using the default constructor
		Car myCar = new Car();   // new allows to create new object in Car -- this one is empty -- can have args
		
		System.out.println(myCar.getDoors());
		
		// Creating an object using everything constructor (i.e. the 2nd constructor) 
				// this one is using the second constructor = the values are being put in as said in the 2nd constructor
				// the arguments dont have to be exactly the same
		Car jordanCar = new Car(3, "BMW", 140);
		
		
		// Con
		
		System.out.println(jordanCar.getDoors());
		
		System.out.println(jordanCar); // Needs a toString to RUN!!!! 
		
		
		
		// random method call -- but needs to use default constructor
		
		myCar.hello ();
		
	}
	
	
}
