package com.qa.enhancedforloops;

import java.util.ArrayList;
import java.util.List;

public class EnhancedForLoopsExercise {

	public static void main(String[] args) {
		
//		arrayLExer1();
//		arrayLExer2();
//		arrayLExer3();
//		arrayLExer4();
		questionFour();
	}
	
	
	public static void arrayLExer1() {
		
		List<String> cars = new ArrayList<>();
		
		// Add Elements to the list
				cars.add("Mercedes");
				cars.add("Ferrari");
				cars.add("Maserati");
				cars.add("Ford");
				cars.add("Lamborghini");
				cars.add("Bugati");
				
			for(String carname: cars) {
				
				System.out.println(carname);
			}
	}
	
	public static void arrayLExer2() {
		
		List<Integer> nums = new ArrayList<>();
		
		for (int i = 1; i<21; i++) {
			nums.add(i);
		}
			System.out.println(nums);
			System.out.println("========================");
			
			for(Integer numbers : nums) {
				System.out.println(numbers);
				System.out.println(numbers*numbers);
			}
			
	}
	
	public static void arrayLExer3() {
		
		int numeric = 5;
		
		if (numeric % 2 == 0) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
		
	}
	
	// Another way for exercise 3 - Jordan Solution
	public static Boolean evenOdd(int x) {
		if (x % 2 == 0) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public static void arrayLExer4() {
		
	List<Integer> nums = new ArrayList<>();
		
		for (int i = 1; i<21; i++) {
			nums.add(i);
		}
			System.out.println(nums);
			System.out.println("========================");
			
			// =====================================================================
			for (Integer integer : nums) {
				if (integer % 2 == 0) {
					System.out.println("True");
				} else {
					System.out.println("False");
				}
			}
			// =====================================================================	
				
			for (Integer integer2 : nums) {
				if (integer2 % 2 == 0) {
					System.out.println(integer2 + "^3 = " + integer2*integer2*integer2);
				} 
				else {
					System.out.println(integer2 + "^2 = " + integer2*integer2);
				}
			}
			
			// =====================================================================	
			
			for (Integer integer2 : nums) {
				if (integer2 % 2 == 0) {
					System.out.println(Math.round(Math.pow(integer2,3)));
				} 
				else {
					System.out.println(Math.round(Math.pow(integer2,2)));
				}
			}
				
			}
		
	
	public static void questionFour() {
		
		List<Integer> nums = new ArrayList<>();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		nums.add(5);
		nums.add(6);
		
		for (int i : nums) {
			if (evenOdd(i)) {
				System.out.println("The number " + i + " cubed is: " + i * i* i);
			} else {
				System.out.println(i*i);
			}
			}
		}
	
	}
		
	
		
	


