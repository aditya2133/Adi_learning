package com.qa.operatorconditionaliterationtesting;

public class OperatorsTest 
{
	 
	static int num1 = 5;
	static int num2 = 10;
	
	public static void addition1() 
	{
		int result1 = num1 + num2;
		System.out.println(result1);
		;
	}
	
	public static void subtraction() 
	{
		int result2 = num2 - num1;
			System.out.println(result2);
	}

 
	public static void divide() {
		int result3 = num2 / num1;
		System.out.println(result3);
	}
	
	
	public static void multiply() {
		
		int result4 = num2 * num1;
		System.out.println(result4);
	}
	
	public static void modulus() {
		
		int result5 = num2 % num1;
		System.out.println(result5);
	}
	
		
	public static void indicatingPositive() {
		num1 += num1;
		System.out.println(num1);
	}
	
	
	public static void inidicatingNegative() {

		num1 -= num1;
		System.out.println(num1);
	}


	public static void incrementOne() {
		num1++;
		System.out.println(num1);
	}

	
	public static void decrementOne() {
		num1--;
		System.out.println(num1);
	}
	

	public static void notOps() {
		boolean bool = true;
		System.out.println(!bool);
	}
	
	
	public static void main(String[] args) 
	{
		addition1();
		subtraction();
		divide();
		multiply();
		modulus();
		indicatingPositive();
		inidicatingNegative();
		incrementOne();
		decrementOne();
		notOps();
			
	}
		
}


	
	
	
		
//	public int num1;
//	public int num2;
//	
//	
//	public OperatorsTest() {
		
//	}
	
	
	
	
//	int num1 = -12;
//	int num2 = 5;
//	int result = num1 -= num2;
//	System.out.println(result);
//	num2++;
//	System.out.println(num2);
	
	


