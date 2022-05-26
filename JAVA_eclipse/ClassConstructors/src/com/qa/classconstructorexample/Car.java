package com.qa.classconstructorexample;

public class Car {

	private int doors;      // 
	private String make;
	private int horsepower;
	
	// Both constructors MUST HAVE the name of the Class!!!!!
	// Default Constructor - the one with nothing in it
	
	public Car() {  }    // never has anything in it -- alway empty-- ALWAYS HAS NAME OF CLASS!!
	
	
	// Everything constructor -- constructors cant be the same - 2nd constructor -- this has everything in it!
	
	public Car(int doors, String make, int horsepower) {   // the arguments dont have to be exactly the same
		this.doors = doors;
		this.make = make;
		this.horsepower = horsepower;
	}
	
	public int getDoors() {
		return doors;
		
	}
	
	
	@Override
	public String toString() {
		return "Car [doors= " + doors + ", make= " + make + ", horsepower= " + horsepower + "]";
	}


	// random method
	public void hello() {
		System.out.println("Hello");
	}
	
	
	
}
