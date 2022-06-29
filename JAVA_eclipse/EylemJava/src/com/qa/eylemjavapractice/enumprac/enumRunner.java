package com.qa.eylemjavapractice.enumprac;

public class enumRunner {

	public static void main(String[] args) {
		
		double earthWeight = Double.parseDouble("175");
		System.out.println(earthWeight);
		
		double mass = earthWeight / Planets.Earth.someGrav();
		System.out.println(mass);
		
	}
	
}
