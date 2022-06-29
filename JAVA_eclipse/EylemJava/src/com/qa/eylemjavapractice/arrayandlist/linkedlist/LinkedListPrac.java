package com.qa.eylemjavapractice.arrayandlist.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListPrac {

	public static void main(String[] args) {
		
		
		
		var staff = new LinkedList <String>();
		staff.add("Amy");
		staff.add("John");
		staff.add("Paul");
		
		System.out.println(staff);
		
		
		Iterator<String> iter = staff.iterator();
		
//		String first = iter.next();
		String second = iter.next();
		
		
//		System.out.println(first);
		System.out.println(second);
		
		while(iter.hasNext()) {
		System.out.println(iter.next());}
	}
	
}
