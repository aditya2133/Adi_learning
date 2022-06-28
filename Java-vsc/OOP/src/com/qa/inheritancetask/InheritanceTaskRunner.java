package com.qa.inheritancetask;

public class InheritanceTaskRunner {

	
	public static void main(String[] args) {
		
			Ferrari enzoFerrari = new Ferrari();

				System.out.println(enzoFerrari);
		
			
				Ferrari F50 = new Ferrari (4, "Red", 600f, false);
				System.out.println(F50);
			
			
			
			Lorry mercLorry = new Lorry();
				mercLorry.fuel();
				mercLorry.speed();
				
			
			
			
			FordFocus fordFocus = new FordFocus();
				System.out.println(fordFocus);
		
				fordFocus.setSeatNo(5);
				
				System.out.println(fordFocus);
		
	}
}
