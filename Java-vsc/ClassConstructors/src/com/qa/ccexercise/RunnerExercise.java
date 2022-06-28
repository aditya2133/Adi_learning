package com.qa.ccexercise;

public class RunnerExercise {

	
	public static void main(String[] args) {
		
		Animals animalia = new Animals();
		
		Animals animalia2 = new Animals("Dog", 4, false, "Brown");
		Animals animalia6 = new Animals("cat", 4, false, "White");
		
		Animals animalia3 = new Animals("Cat");
		
		Animals animalia4 = new Animals(2, "Sapiens");
		
		Animals animalia5 = new Animals("Eagles", true);
		
		System.out.println(animalia);
		System.out.println(animalia2);
		System.out.println(animalia3);
		System.out.println(animalia4);
		System.out.println(animalia6);
		System.out.println(animalia5);
		
		animalia5.example();
		
	}
}
