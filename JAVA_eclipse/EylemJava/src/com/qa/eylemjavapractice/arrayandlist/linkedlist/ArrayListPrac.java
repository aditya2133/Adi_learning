package com.qa.eylemjavapractice.arrayandlist.linkedlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListPrac {

	public static void main(String[] args) {
		
		List<String> food = new ArrayList<>();
		
		food.add("Sandwich");
		food.add("Papad");
		food.add("Dhokla");
		
		
		System.out.println(food);
		
		System.out.println(food.get(1));
		
		food.set(0, "Biryani");
		System.out.println(food);
		
//		food.remove(0);
//		System.out.println(food);

		food.size();

//		food.clear();
//		System.out.println(food);
		
		// for loop
		for (int i=0; i<food.size(); i++) {
			System.out.println(food.get(i));
		}
		
		//enhanced-for loop
		
		for (String i : food){
		    System.out.println(i);
		}
		
		
		 Collections.sort(food);

	        for (String i : food) {
	            System.out.println(i);
	
	        }
	}
	
}
