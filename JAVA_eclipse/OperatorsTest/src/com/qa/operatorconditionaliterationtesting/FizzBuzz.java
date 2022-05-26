package com.qa.operatorconditionaliterationtesting;

public class FizzBuzz {

	public static void main(String[] args) {
				
		for(int i = 1; i < 31; i++)
		
		if(i % 3 == 0 || i % 5 == 0 )
			
			if(i % 3 == 0 && i % 5 != 0)
				
				{	System.out.println("Fizz");
				} 
				else if (i % 5 == 0 && i % 3 != 0)
				{	System.out.println("Buzz");
				}
		
			else//  (i % 5 == 0 && i % 3== 0)
				{	System.out.println("FizzBuzz");
				}
		else 
		{	System.out.println(i);
		}
		
		
	}
	
}
