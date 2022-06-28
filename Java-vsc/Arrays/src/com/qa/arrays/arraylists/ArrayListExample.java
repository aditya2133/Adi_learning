package com.qa.arrays.arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExample {

	
	public static void main(String[] args) {
		
		List<String> cities = new ArrayList<>();
		
		
		// adding to a list
		cities.add("London");
		cities.add("Paris");
		cities.add("Lisbon");
		cities.add("Berlin");
		cities.add("Madrid");
		
		// getting info from a list using integer
		System.out.println(cities.get(0));
		
		// setting an element in the list to something else
		
		cities.set(0,  "Tokyo");
		
//		cities.remove(0);
		
//		cities.size();
		
//		cities.clear();
		
		
		// use cities.get(i) to print each value in the list
		// if you print just the list, you get all 4 values 4 times
		for(int i=0; i<cities.size();i++) { 
			System.out.println(cities);
		}
		
		System.out.println("========================================");
		Collections.sort(cities);
		System.out.println(cities);
		
		
		
				
		
		
	}
	
}
