package com.qa.solidsprin.interfacessegregation;

public class Falcon implements FlyingCreature, EggLayingCreature {

	private String currentLocation;
	private int numberOfEggs;
// constructor 
	public Falcon(int initialEggCount) {
		this.setNumberOfEggs(initialEggCount);
	}

	
	// methods 
	@Override
	public void layEggs() {
		this.setNumberOfEggs(getNumberOfEggs() + 1);

	}

	@Override
	public void fly() {
		this.setCurrentLocation("soaring above the clouds");

	}
	
	
	// getters and setters 
	public String getCurrentLocation() {
		return currentLocation;
	}

	public void setCurrentLocation(String currentLocation) {
		this.currentLocation = currentLocation;
	}

	public int getNumberOfEggs() {
		return numberOfEggs;
	}

	public void setNumberOfEggs(int numberOfEggs) {
		this.numberOfEggs = numberOfEggs;
	}

}
