package com.qa.operatorconditionaliterationtesting;

public class ConditionalsTest 
{

	public static void main(String[] args) 	{
	// if/else - boolean
		boolean isLightOn = false;
		
		if (isLightOn) 
		{
			System.out.println("Light is on");
		}	else
			{
				System.out.println("Light is off");
			}		
		
	// if - equal to
		int num1 = 10;
		
		if (num1==10)
		{
			System.out.println("Equal");
		}	else 
			{ System.out.println("Not equal");
			
			}
		
		
	// if-not equal
		int num2 = 8;
		
		if (num2 != 10)
		{ 
			System.out.println("Not equal");
		}
			else 
			{
			System.out.println("equal");
			}
			
			
	// less than or greater to
		int num3 = 9;
		
		if (num3 < 10) 
		{
			System.out.println("Less than 10");
		}
			else 
			{System.out.println("greater than or equal to 10");
			}
		
		
	// greater or equal
		int num4 = 29;
		
		if (num4 >=50) 
		{
			System.out.println("Greater or equal to 50");
		}
		else 
		{
			System.out.println("less than 50");
		}
		
	
	// Logical AND
		int num5 = 5;
		int num6 = 6;
		
		if (num5 < 6 && num6 > 5)
		{System.out.println("logic true");
		
		}
		else
		{
			System.out.println("logic false");
		}
		
		
	//Logical OR
		if (num5 == 5 || num6 == 10)
		{
			System.out.println("something is true");
		} else {
			System.out.println("both false");
		}
		
		
		
		
	// Bitwise AND
		 int number = 10;
	     int number2 = 20;

	        if(number >= 10 & number2 == 20) {
	            System.out.println("Number is greater than or equal to 10 and Number 2 is equal to 20");
	        } else {
	            System.out.println("Number is less than 10, or Number 2 is not equal to 20");
	        }
	        
	        
	 // Bitwise OR
	        int number3 = 9;
	        int number4 = 20;

	        if(number3 >= 10 | number4 == 20) {
	            System.out.println("Number is greater than or equal to 10 or Number 2 is equal to 20");
	        } else {
	            System.out.println("Number is less than 10, and Number 2 is not equal to 20");
	        }
	        
	  
	 // Type comparison
//	        Car car = new Car();
//
//	        if(car instanceof Car) {
//	            System.out.println("This is a Car");
//	        } else {
//	            System.out.println("This is not a Car");
//	        }
//	        
	      
	 // If/else if/else
	        int num10 = 50; 
	        if (num10 <= 20)
	        {
	        	System.out.println("Less than or equal to 20");
	        
	        } else if(num10 < 40) 
	        {
	        	System.out.println("Between 20 and 40");
	        } else
	        {
	        	System.out.println("equal to greater than 40");
	        }
	    
	        
	  // Switch/Case/break    
	        
	        int day = 5;
	        
	        switch(day) {
	        case 1: 
	        	System.out.println("1");
	        	break;
	        case 2:
	        	System.out.println("2");
	        	break;
	        case 3:
	        	System.out.println("3");
	        	break;
	        case 4:
	        	System.out.println("4");
	        	break;
	        case 5:
	        	System.out.println("5");
	        	break;
	        case 6:
	        	System.out.println("6");
	        	break;
	        case 7:
	        	System.out.println("7");
	        	break;
        }       	
	}
}
