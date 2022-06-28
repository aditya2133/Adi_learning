package com.qa.polymorphismexamplerunner;

import com.qa.polymorphismexample.PolyMExampleChild;
import com.qa.polymorphismexample.PolyMExampleParent;


public class PolyMRunner {

	
	public static void main(String[] args) {
		
		
		System.out.println("==============Child============");
		PolyMExampleParent polyMExP = new PolyMExampleParent();
		
		PolyMExampleChild polyMExC = new PolyMExampleChild();
		
		
		polyMExC.tyres();
		
		System.out.println("======Parent========");
		
		polyMExP.speed();
		
		
		System.out.println("========parent from child========");
		
		polyMExC.speed();
		
		
		
		
		
		
	}
}
