package com.qa.abstractionexample.runner;

import com.qa.abstractionexample.Food;
import com.qa.abstractionexample.Pasta;
import com.qa.abstractionexample.Tandoori;

public class AbstractionExRunner {

	
	public static void main(String[] args) {
		
		Pasta pasta = new Pasta();
		
		Tandoori chicken = new Tandoori();
		
		Food food = new Pasta();
		
		
		pasta.ingredients();
		
		System.out.println(pasta);
		
		
		
		
	}
	
}
