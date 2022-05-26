package com.qa.inheritanceeg;

public class Sphynx extends Cat {

	private int legs;

	public Sphynx() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Sphynx(String colour, String habitat, int legs) {
		super(colour, habitat); 
		// refering to the superclass
		// TODO Auto-generated constructor stub
		// generated from supercllss and updated -- has more attributes than Cats but 
		this.legs = legs;
	}
	
//	@Override
//	public void noise() {
//		System.out.println("Meow");
//	}
	
	@Override
	public void eat() {
		System.out.println("Only finest cat food");
	}

	@Override
	public String toString() {
		return "Sphynx [legs=" + legs + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}


	
	
	
	
	
}
