package com.qa.solidsprin.liskov;

public class Studio {
    private int squareFootage;
    private int numberOfBedrooms;

    // Constructor - sets number of bedrooms to 0 here
    public Studio() {
        this.setNumberOfBedrooms(0);
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