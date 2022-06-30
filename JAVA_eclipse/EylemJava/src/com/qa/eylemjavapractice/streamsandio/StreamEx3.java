package com.qa.eylemjavapractice.streamsandio;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class StreamEx3 {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(541, 25, 52, 623, 31, 662);

//		int nums = numbers.stream()
//				.map	
//				.max(x->x).orElseThrow(NoSuchElementException::new);;
//					System.out.println(nums);
//		

		// then max
		Integer max = numbers.stream().mapToInt(v -> v).max().orElseThrow(NoSuchElementException::new);
		System.out.println(max);

		// min
		Integer min = numbers.stream().mapToInt(v -> v).min().orElseThrow(NoSuchElementException::new);
		System.out.println(min);
		
		
		
		

	}

}
