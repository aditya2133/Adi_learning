package com.qa.eylemjavapractice.lambdaprac;

import java.util.ArrayList;



public class LambPrac {
	
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList <>();
		
		arrayList.add(1368);
		arrayList.add(183);
		arrayList.add(16);
		arrayList.add(5);
		
		
		arrayList.forEach(n -> {if (n%2==0) System.out.println(n + " This is divisible by 2");});
		
		
		System.out.println(arrayList);
		
		for (int i: arrayList) {
			System.out.println(i);
			
	}		
			
			  arrayList.forEach(n -> System.out.println(n));

	
	}
	
}
