package com.qa.solidsprin.liskov;

public class Runner {

	public static void main(String[] args) {
		
		// create a penthouse
		// create a studio
		//run
		
		Penthouse pent = new Penthouse();
		
		System.out.println(pent.getNumberOfBedrooms());
		
		BedroomAdder bedAdd = new BedroomAdder();
//		System.out.println(bedAdd.addBedroom(pent));
		
	}
	
//	
}
