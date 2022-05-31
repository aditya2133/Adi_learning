package com.qa.solidsprin.interfacessegregation;

public class Dodo implements ExtinctCreature, EggLayingCreature {

	private String currentLocation;
	private int numberOfEggs;

	@Override
	public void layEggs() {
		this.setNumberOfEggs(getNumberOfEggs() + 1);
	}

	@Override
    public void goExtinct() {
        this.setCurrentLocation("in a museum");
    }

// constructor
	public Dodo(int initialEggCount) {
		this.setNumberOfEggs(initialEggCount);
	}

	public Dodo() {
		// TODO Auto-generated constructor stub
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
