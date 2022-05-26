package com.qa.inheritancetask;

public class Cars {

	private int wheelNumber = 4;
	private String colour = "Blue";
	
	
	public Cars() {}
	
	public Cars(int wheelNumber, String colour) {
		this.wheelNumber = wheelNumber;
		this.colour = colour;
		
	}
	
	public void speed() {
		System.out.println("faster than a person");
	}
	
	public void fuel() {
		System.out.println("Diesel");
	}

	@Override
	public String toString() {
		return "Cars [wheelNumber=" + wheelNumber + ", colour=" + colour + "]";
	}
	
	
	
}
