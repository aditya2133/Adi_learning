package com.qa.stringmanipulation;

public class StingManiExercise {

	
	public static void main(String[] args) {
		
//		ex1();
//		ex2();
		ex3();
		
		
	}
	
	public static void ex1() {
		
		String str1 = new String("yesterday it was raining");
		String str2 = new String("today it is sunny");
		
		System.out.println(str2.toUpperCase().concat(", ").concat(str1.toUpperCase()));
		
		
		System.out.println(str2.toUpperCase().substring(0,17));
		
		
		String totStr = new String(str2.toUpperCase().concat(", ").concat(str1.toUpperCase()));
		System.out.println(totStr);
		System.out.println(totStr.substring(0, 17) + " | " + totStr.substring(20));
	}
	
	public static void ex2() {
		
	String myString = "I like to Sting it, string it"; 
		
//		// Method 1 - count length of string
//		System.out.println(myString.length());
//		
		
		
		// Method 2 -- print them in line
//		String substr = " ";
//		
//		for (int i=0; i <= myString.length();i++) {
//		 
//			
//			while (myString.charAt(i) != " ") {
//			 System.out.println(myString);
//			 	 
//		 }
//		}
//	}
	public static void ex3 (String myString) {
		
		String jrd = "";
		
		for (int i = myString.length(); i>0 ; i--) {// loop ready
			
			if (myString.substring(i-1,i).equals(" ")) {
				System.out.println(jrd);
				jrd = "";
			} else 
			{
				jrd = myString.substring(i-1,i) + jrd;
				
				}
			}
			
		}
	}
			 
//			}
			
		
////		
//		//Method 3--
//		
//		for (int i = myString.length(); i >= 2 ;i--) {
//			System.out.println(myString.substring(i,i+1));
//		}
//		
		
		
	
	
	

