package com.qa.eylemjavapractice.streamsandio;

//import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//import java.util.stream.Stream;
import java.util.stream.Collectors;


public class StreamEx1 {

	public static void main(String[] args) {
		
		
		List<String> names = Arrays.asList("Michael", "Dean", "James", "Chris");
		
//		List<String> names = new ArrayList<>();
//		
//		names.add("Michael");
//		names.add("Dean");
//		names.add("James");
//		names.add("Chris");
			
		List<String> name = 
				names.stream()
					.filter(str -> !str.equals("James"))
					.collect(Collectors.toList());
//						!=System.out.println("Hello" + !x)););
		name.forEach(x->{System.out.println("hello " + x);});
	
	
	
	
	
		List<Integer> numbers = Arrays.asList(3,4,7,8,12);

			int nums = 
		        numbers.stream()
		            .reduce((a,b) -> a*b)
		            .get();
				System.out.println(nums);
				
				
		 
				
	
}
}