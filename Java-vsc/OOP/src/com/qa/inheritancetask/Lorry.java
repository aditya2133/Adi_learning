package com.qa.inheritancetask;

public class Lorry extends Cars {

	private String loadCarry;
	private float distTravel;
	
	// Default constructor
	public Lorry() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	// Everything Constructor
	public Lorry(int wheelNumber, String colour, String loadCarry, float distTravel) {
		super(wheelNumber, colour);
		// TODO Auto-generated constructor stub
		this.loadCarry = loadCarry;
		this.distTravel = distTravel;
				
	}
	
	
//	public void speed() {
//		System.out.println("faster than a person");
//	}
//	
	public void fuel() {
		System.out.println("Whatever it can find");
	}


	@Override
	public String toString() {
		return "Lorry [loadCarry=" + loadCarry + ", distTravel=" + distTravel + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	
	
}
