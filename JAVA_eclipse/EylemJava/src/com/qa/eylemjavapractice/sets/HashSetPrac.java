package com.qa.eylemjavapractice.sets;

import java.util.HashSet;
import java.util.Set;

public class HashSetPrac {

	public static void main(String[] args) {
		
		Set<Integer> hashNumbers = new HashSet<>();
		
		hashNumbers.add((int) 1e2);
		hashNumbers.add((int) 5e5);
		hashNumbers.add((int) 6e3);
		
		System.out.println(hashNumbers.isEmpty());
		
		System.out.println(hashNumbers.size());
		
		hashNumbers.remove((int)1e2);
		
		System.out.println(hashNumbers);
		
		System.out.println(hashNumbers.contains((int)6e3));
		System.out.println(hashNumbers.contains((int)6e4));
	}
	
}
