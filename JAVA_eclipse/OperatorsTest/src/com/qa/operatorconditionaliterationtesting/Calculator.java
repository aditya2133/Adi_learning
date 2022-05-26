package com.qa.operatorconditionaliterationtesting;

public class Calculator {
static int num1 = 20;
static int num2 = 4;

//
//	public static void addition1() 
//	{
//		int sum = num1 + num2;
//		System.out.println("sum = " + sum);
//		;
//	}
//	
//	public static void subtraction() 
//	{
//		int diff = num2 - num1;
//			System.out.println("difference = " + diff);
//	}
//
// 
//	public static void divide() {
//		int result3 = num2 / num1;
//		System.out.println("division = " +result3);
//	}
//	
//	
//	public static void multiply() {
//		
//		int result4 = num2 * num1;
//		System.out.println("Product = " + result4);
//	}
//
//	
//	public static void fixedDivide() {
//		double num3 = num1;
//		double num4 = num2;
//		double result10 = num3 / num4;
//		System.out.println("division = " +result10);
//	}
//	
//	
public static void main(String[] args)

{
//	addition1();
//	subtraction();
//	multiply();
//	divide();
//	fixedDivide();
//	fixedDivide2();
	division(20, 4);
}
	

// Division revisited
//public static void fixedDivide2() {
//	double num3 = num1;
//	double num4 = num2;
//	
//	if(num3 < num4) 
//	{
//		double result11 = num3 / num4;
//	System.out.println("divisionnew = " +result11);
//	}
//	else {
//		System.out.println("Does not compute");
//	}
//}
// Division from Jordan 
public static Double division(double num1, double num2) {
	// if arguments are put in these brackets above the values have to be put in into the main method brackets too!!!
	
	if (num1 < num2) {
		double answer = num1/num2;
		System.out.println(answer);
	} else {
		System.out.println("These numbers dont work");
	}
	return 0.0;
}
}

//}
