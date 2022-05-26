package com.qa.arrays.arraytest;

public class ArrayTest {

	public static void main(String[] args ) {
		
		// way 1
		int[] scores; 
		scores = new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13};
		
		// way 2
		int[] ratings = {1,2,3,4,5,6,7,8,9};
		
		
		// way 3
		int[] ages = new int[10];
		ages[0] = 2;
		
		System.out.println(ratings.length);
		
		// system.out.println
		
		// FOR loop to print array
		for (int i = 0; i < ratings.length; i++) {
			System.out.println(ratings[i]);
		}
		
		
		
		// Multidimension array
		int[][] newArr;
		int[][] newArr2 = {{1,2,3},{13,132,14},{2}};
		int[][] newArr3= new int[2][6];  // 2 = no/ dimensions of Array, 6 = no of values in the arrays!
		// entering data
		newArr3[1][0] = 208; // 1 = which array, 0 = which position in that array!
		
		
	}
}
