package com.qa.inheritancetask;

public class FordFocus extends Cars {

	private int seatNo;
	private float mileage;
	
	
	
	// Default constructor - -- from source-->generate constructors
	public FordFocus() {
		super();
		// TODO Auto-generated constructor stub
	}


	// Everything constructor
	public FordFocus(int wheelNumber, String colour, int seatNo, float mileage) {
		super(wheelNumber, colour);
		// TODO Auto-generated constructor stub
		this.seatNo = seatNo;
		this.mileage = mileage;
	}
	
	
	@Override
	public void speed() {
		System.out.println("Not that great");
	}


	@Override
	public String toString() {
		return "FordFocus [seatNo=" + seatNo + ", mileage=" + mileage + ", toString()=" + super.toString() + "]";
	}


	public int getSeatNo() {
		return seatNo;
	}


	public void setSeatNo(int seatNo) {
		this.seatNo = seatNo;
	}


	public float getMileage() {
		return mileage;
	}


	public void setMileage(float mileage) {
		this.mileage = mileage;
	}
	
	
	
//	public void fuel() {
//		System.out.println("Diesel");
//	}
	
	
	
	
	
	
		
}
