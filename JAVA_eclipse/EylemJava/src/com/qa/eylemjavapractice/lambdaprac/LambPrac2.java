package com.qa.eylemjavapractice.lambdaprac;


public class LambPrac2 {
 
	interface HowToInterfaceLambda {
		float func(float a, float b, float c);
	}
	
	
	
	
	
	private float func2(float a, float b, float c, HowToInterfaceLambda someObj) {
		
		return someObj.func(a, b, c);
	}
	
	
	
	
	public static void main(String[] args) {
		
		HowToInterfaceLambda mathOp = (float a, float b, float c) -> (a+b)/c;
		
		LambPrac2 lamPra = new LambPrac2(); 
		
		float x = lamPra.func2(30,20,30, mathOp);
		System.out.println(x);
		
	}
	
	
}
