package com.qa.abstractionexample;

public class Pasta extends Food {

	@Override
	public String ingredients() {
		// TODO Auto-generated method stub
	return("pasta,tomato,sausages");
	
	}

	@Override
	public void cost() {
		// TODO Auto-generated method stub
		System.out.println("£12");
	}

	@Override
	public void region() {
		// TODO Auto-generated method stub
		System.out.println("Italy");
	}

	
	@Override
	public String toString() {
		return "Pasta [yummy()=" + yummy() + "ingredients()= " + ingredients() + "]";
		
	}

	
	
	
	

}
