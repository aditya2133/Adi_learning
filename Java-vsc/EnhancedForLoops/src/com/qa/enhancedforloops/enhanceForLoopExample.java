package com.qa.enhancedforloops;

import java.util.ArrayList;
import java.util.List;

public class enhanceForLoopExample {


	public static void main(String[] args) {
		
		// Make array List and import ArrayList and List !!!
		List<String> cars = new ArrayList<>();
		
		// Add Elements to the list
		cars.add("Mercedes");
		cars.add("Ferrari");
		cars.add("Maserati");
		cars.add("Ford");
		cars.add("Lamborghini");
		cars.add("Bugati");
		
	// enhanced for loops - for (CTRL+SPACEBAR) then choose foreach
		// enter variable (carname) --- lasts only for the foreach
	for (String carname : cars) {
		System.out.println(carname);
		
	}
		
}
}