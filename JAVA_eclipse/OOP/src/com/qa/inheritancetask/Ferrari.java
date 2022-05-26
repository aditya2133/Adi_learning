package com.qa.inheritancetask;

public class Ferrari extends Cars{

	private float enginePower;
	private boolean twinTurbo = true;
	
	// default constructor with including superclass
	public Ferrari() {
		super();
	}

	
	// everything constructor with superclass
	public Ferrari(int wheelNumber, String colour, float enginePower, boolean twinTurbo) {
		super(wheelNumber, colour);
		// TODO Auto-generated constructor stub
		this.enginePower = enginePower;
		this.twinTurbo = twinTurbo;
		
	}
	
	@Override
	public void speed() {
		System.out.println("This goes very very fast");
	}
	
	@Override
	public void fuel() {
		System.out.println("Petrol");
	
	}


	@Override
	public String toString() {
		return "Ferrari [enginePower=" + enginePower + ", twinTurbo=" + twinTurbo + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	
	
	
	
}
