package com.qa.arrays.arraytest;

public class ArrayExercises {

	
		
	
	public void array1() {
		
		int[] arr1 = {11,12,13,14,15,16,17,18,19,20};
		
		for (int i=0; i < arr1.length; i++){
			System.out.println(arr1[i]);
		}
		
		
	}
	
	
	public void array2() {
		int a=20;
		int[] arr2 = new int[a];
		
		for (int i = 0; i <arr2.length; i++) {
			arr2[i] = i-31;
			
		}
		for (int i=0; i < arr2.length; i++){
			System.out.println(arr2[i]); 
		}
		
		for (int i = 0; i <arr2.length; i++) {
			arr2[i] = arr2[i]*10;
		}
		for (int i=0; i < arr2.length; i++){
			System.out.println(arr2[i]); 
		}
		
	}
	
	public void array22() {
		int a=20;
		int[] arr2 = new int[a];
		
		for (int i = 0; i <arr2.length; i++) {
			arr2[i] = i-31;
			
		}
		for (int i=0; i < arr2.length; i++){
			System.out.println(arr2[i]); 
		}
		for (int i=0; i < arr2.length; i++){
			System.out.println(arr2[i]*10); 
		}
	}
	
	
}
