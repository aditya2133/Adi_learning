package com.qa.ccexercise;

public class Animals {

	// Create a class of your choice, Create 4 private attributes in the class,
	// and create 5 different constructors, and then have a go at calling these
	// different constructors from the main runner class (the class with the main method)

	private String species;
	private int numlegs;
	private boolean flynotfly;
	private String colour;

	// Default constructor
	public Animals() {
	}

	// 2nd everything constructor

	public Animals(String species, int numlegs, boolean flynotfly, String colour) {
		this.species = species;
		this.numlegs = numlegs;
		this.flynotfly = flynotfly;
		this.colour = colour;

	}

	
	
	
	@Override										// overides any other method when needed!!	
	public String toString() {
		return "Animals [species=" + species + ", numlegs=" + numlegs + ", flynotfly=" + flynotfly + ", colour="
				+ colour + "]";
	}

	// 3rd Constructor
	public Animals(String species) {
		this.species = species;
	}
	
	// 4th Constructor
	public Animals(int numlegs, String species) {
		this.species = species;
		this.numlegs = numlegs;
	}

	// 5th Constructor
	public Animals(String species, boolean flynotfly) {
		this.flynotfly = flynotfly;
		this.species = species;
	}

	
	public void example() {
		
		System.out.println("hello");
	}
}
