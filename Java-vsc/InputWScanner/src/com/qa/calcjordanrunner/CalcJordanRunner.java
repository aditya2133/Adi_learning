package com.qa.calcjordanrunner;

import java.util.Scanner;

import com.qa.calcjordan.CalcJordan;

public class CalcJordanRunner {

	
	public static void main(String[] args) {
		
		try (Scanner input = new Scanner(System.in)) {
			CalcJordan calc = new CalcJordan();
			
			System.out.println("Enter first no.");
			double a = input.nextDouble();
			
			input.nextLine();
			System.out.println("Enter second no.");
			double b = input.nextDouble();
			
			input.nextLine();
			
			// few different ways to do this next part
			System.out.println("What operator?");
			String operator = input.nextLine();
			
			
			switch (operator) {
			case "Addition":
				System.out.println("Addition ans is " + calc.add(a,b));
				break;
			case "Subtract":
				System.out.println("Addition ans is " + calc.subtract(a,b));
				break;
			case "Mulitply":
				System.out.println("Multiply ans is " + calc.multiply(a,b));
				break;
			case "Divide":
				System.out.println("Divide ans is " + calc.divide(a,b));
				break;
			
				
			}
		}
		
	}
}
