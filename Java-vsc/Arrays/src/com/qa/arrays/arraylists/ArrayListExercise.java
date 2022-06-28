package com.qa.arrays.arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExercise {

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
		
		// Print out list
		System.out.println(cars);
		
		
		//
		System.out.println("=================================================");
		
		// Print out List using 
		// use name.get(i) to ennsure a clean list, otherwise it will print the whole list multiple times
		for(int i=0; i<cars.size();i++) { 
			System.out.println(cars.get(i));
		}
		
		System.out.println("=============================================");
		// Get specific elements
		cars.get(3);
		System.out.println(cars);
		System.out.println("=========================================");
		
		
		// Set element
		cars.set(3, "Koenigsegg");
		System.out.println(cars);
		System.out.println("================================================");
		
		// remove element
		cars.remove(0);
		System.out.println(cars);
		System.out.println("================================================");
		// sort array
		Collections.sort(cars);
		System.out.println(cars);
		System.out.println("================================================");
		
		// reverse sort
		Collections.reverse(cars);
		System.out.println(cars);
		System.out.println("================================================");
		
		// swap function
		Collections.swap(cars, 1, 3);
		System.out.println(cars);
		System.out.println("================================================");
		
		
		// enhanced for loops - for (CTRL+SPACEBAR) then choose foreach
		for (String carname : cars) {
			System.out.println(carname);
			
		}
		
		
	}
	
}
