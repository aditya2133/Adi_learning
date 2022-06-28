package com.qa.eylemjavapractice.junittest1;

public class Something {
	
	static int a = 1;
	static int b = 2;
	public int c;
	
	public int add () {
	c = a+b;
		System.out.println(c);	
	return c;
	}
	
	
	public int eylemadd(int a, int b)
	{
		
		c= (a+b);
		return c;
	}
	
	
	public int subtract() {
		c = a-b;
		System.out.println(c);
		return c;
	}

}
