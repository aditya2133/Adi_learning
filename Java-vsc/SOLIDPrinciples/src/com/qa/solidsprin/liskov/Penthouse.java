package com.qa.solidsprin.liskov;

public class Penthouse {
	
	private int squareFootage;
	private int numberOfBedrooms;
	
	
	// constructor - sets the number of bedroom to 4 for penthouses
	public Penthouse() {
		this.setNumberOfBedrooms(4);
	}
	
	
	// normal getters and setters
	public int getSquareFootage() {
		return squareFootage;
	}
	
	
	public void setSquareFootage(int sqft) {
		
		this.squareFootage = sqft;
	}
	
    public int getNumberOfBedrooms() {
        return numberOfBedrooms;
    }

    public void setNumberOfBedrooms(int numberOfBedrooms) {
        this.numberOfBedrooms = numberOfBedrooms;
    }
	
	
}
