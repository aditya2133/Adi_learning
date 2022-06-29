package com.qa.eylemjavapractice.maps;

import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Map;

public class MapPrac {
public static void main(String[] args) {
	Map<String, String> capitalCities = new HashMap<>();
	
	capitalCities.put("England", "London");
	capitalCities.put("France", "Paris");
	capitalCities.put("Germany", "Berlin");
	
	for (String i :capitalCities.keySet()) {
		System.out.println(i);
		
	}
	
	for (String u : capitalCities.values()) {
		System.out.println(u);
	}
	
	for (Entry<String, String> i : capitalCities.entrySet()) {
		System.out.println(i);
	}
	
	
}
}
