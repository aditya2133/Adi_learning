package com.qa.accessmodifiers;

public class AMExercise1Runner {

	
	public static void main(String[] args) {
		
		AMExercise1 AMex1 = new AMExercise1 ();
		AMex1.setCustName("Whatevs");
		AMex1.setcustSurname("dosowto");
		AMex1.setAmountValue(1.282e10f);
		
		AMExercise1 custOne = new AMExercise1 ("John", "Doe", 123456789, 1122334455, (float)19102.21);
		
		
		AMExercise1 custTwo = new AMExercise1 ("Sarah", "Jane", 2987325235.13f);
		custTwo.setPassportNumber(124720547);
		custTwo.setCustName("Doctor");
		
		
		System.out.println(custOne);
		
		System.out.println(custTwo.getAmountValue());
		
		System.out.println(AMex1);
		
	}
}
