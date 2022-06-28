package com.qa.solidsprin.dependancyinversion;

import java.util.ArrayList;
import java.util.List;

public class Runner {

	public static void main(String[] arg) {
		
	List<Developer> developers = new ArrayList<>();
		
		BackendDeveloper be = new BackendDeveloper();
		
		
		Project pro = new Project(developers);
		
		
		developers.add(be);
		
		pro.something();
		
		
	}
}
