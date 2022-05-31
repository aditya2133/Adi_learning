package com.qa.scannereg.runner;

import java.util.Scanner;



public class ScannerTest {

	
	public void tryMeOut() {
		
		// Instantiate/ initiate Scanner
		Scanner scan = new Scanner(System.in);
		
		
			
		System.out.println("How many drinks have you had today?"); // ask something:
		int num = scan.nextInt();									// users input
		
		System.out.println("What time is it?");
		int time = scan.nextInt();
		// extra scan.nextLine(); -- goes after anything which is not a nextLine
		
		scan.nextLine();
		
		
		
		System.out.println("What is your favorite food?");
		String food = scan.nextLine();
		
		
		System.out.println("How far do you live?");
		int far = scan.nextInt();
		
		System.out.println("How many drinks did you have yesterday?");
		int yester = num + scan.nextInt();
		
		System.out.println();
		
	
		
		
		
		System.out.println("You have had " + num + " drinks and " + food + ". It is " + time + "o'clock and you live " + far + "km away. You've had " +  yester + "drinks this week");
	}
	 
	
}
