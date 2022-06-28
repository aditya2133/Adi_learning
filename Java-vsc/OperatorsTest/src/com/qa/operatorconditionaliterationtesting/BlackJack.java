package com.qa.operatorconditionaliterationtesting;

public class BlackJack {
	
public static void main(String[] args) {
	//insert 2 numbers here...
	int num1 = 5;
	int num2 = 20;
	
	if(num1 > 0 && num1 <= 21 || num2 > 0 && num2 <= 21)
	{
		if(num1<=21 && 21-num1 < 21-num2 || num2>21)
		{
			System.out.println("Player 1 wins with  " + num1);	
		}
		else if (num2<=21 && 21-num1 > 21-num2 ||num1>21)
		{
			System.out.println("Player 2 wins with " + num2);
		}
		else
		{
			System.out.println("Draw");
		}
	}else 
	{
		System.out.println(0);
	}



}
}
