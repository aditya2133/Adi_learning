package com.qa.inheritanceeg;

public class Lion extends Cat{

	private boolean hasMane;

	public Lion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Lion(String colour, String habitat, boolean hasMane) {
		super(colour, habitat);
		// TODO Auto-generated constructor stub
		
		this.hasMane = hasMane;
	}
	
	@Override
	public void noise() {
		System.out.println("Roar");
	}
	
	@Override
	public void eat() {
		System.out.println("MEAT");
	}
	
	
	
	
	
	
	
}
