package com.qa.stringmanipulation;

public class JordanSolution {

	public void printingVertical(String whatever) {
		
		int i;
		String word = "";
		
		for (i=0; i< whatever.length(); i++) {
			
			if (whatever.substring(i, i+1).equals(" ")) {			// to know where the spaces are in the word
				System.out.println(word);
				word= "";    // empties the value for word or reseting the word
			
			
			} else { // for everytime it is not a space
				word += whatever.substring(i,i+1);
				
			}
			
		}
		System.out.println(word);
		
		
	}
	
	public void printingVerticalReversed (String message) {
		
			String word = "";
			
			for (int i = message.length(); i>0; i--) {
				if (message.substring(i-1,i).equals(" ")) {
					
					System.out.println(word);
					word= "";
				}
				else {
					
//					word = message.substring(i-1,i);  this will print the word backwards
					
					word = message.substring(i-1,i) + word;
				}
			}
			System.out.println(word);
	}
	
	
}
