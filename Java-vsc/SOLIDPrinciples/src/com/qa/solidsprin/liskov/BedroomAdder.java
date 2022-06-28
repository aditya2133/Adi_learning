package com.qa.solidsprin.liskov;

public class BedroomAdder {
 
	// only to penthouse
	public void addBedroom(Penthouse penthouse)	{
		penthouse.setNumberOfBedrooms(penthouse.getNumberOfBedrooms() + 5);
	}
	
}
