package com.qa.scannercalc;

// import java.text.DecimalFormat;
import java.util.Scanner;

public class Operations {

	 double num1;
	 double num2;
	
	
	
	public void numbers() {
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter first number");
			// double num1 = scan.nextFloat();
			scan.nextLine();
			
			System.out.println("Enter second number");
			// double num2 = scan.nextFloat();
			scan.nextLine();
		}
		
	}
	
	
	public void addition() {
		
		double ansadd = num1 + num2;
		System.out.println(ansadd);
				
	}
	
	public void subtraction() {
		
		double anssub = num2-num1;
		System.out.println(anssub);
	}
	
	
	public void multiply() {
		
		double ansmul = num1*num2;
		System.out.println(ansmul);
		
	}

	
	public void division()	{
//		double ansdiv = 0.0;
//		(double) Math.round((ansdiv*100)/100) = num1/num2;
		double ansdiv = num1/num2;
		System.out.println(ansdiv);
//		System.out.println(Math.round((ansdiv*100)/100));
//		System.out.printf(String.format("%.2f",ansdiv));
		
//		DecimalFormat f = new DecimalFormat("##.00");
//	     System.out.println(f.format(ansdiv));
	}
	
	
	
	
	
	public void switchop() {
	
	try (Scanner scan2 = new Scanner(System.in)) {
		System.out.println("Choose: + , - , / , x");
		String userInput = scan2.nextLine();
		
		
		switch(userInput) {
		
		case "+":
			addition();
			break;
		case "-":
			subtraction();
			break;
			
		case "/":
			division();
			break;
			
		case "x":
			multiply();
			break;
			
		default:
			System.out.println("incorrect input");
			break;
			
		
		}
	}
	}
}
