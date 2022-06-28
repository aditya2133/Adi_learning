package com.qa.abstractionexample;

public class Tandoori extends Food{

	@Override
	public String ingredients() {
		// TODO Auto-generated method stub
		return "Chicken, yoghurt, spices";
	}

	@Override
	public void cost() {
		// TODO Auto-generated method stub
		System.out.println("£15");
		
	}

	@Override
	public void region() {
		// TODO Auto-generated method stub
		System.out.println("South East Asia");
		
	}

}
