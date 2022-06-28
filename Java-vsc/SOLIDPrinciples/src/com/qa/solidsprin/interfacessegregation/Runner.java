package com.qa.solidsprin.interfacessegregation;

public class Runner {

	public static void main(String[] args) {
			
		Falcon f = new Falcon(4);
		Dodo d = new Dodo();
		
//		d.setNumberOfEggs(100);
//		
//		System.out.println(d.getNumberOfEggs());
		
//		f.layEggs();
		System.out.println(f.getNumberOfEggs());
		
		f.getCurrentLocation();
		System.out.println(f.getCurrentLocation());
		
		f.setCurrentLocation("somewhere");
		System.out.println(f.getCurrentLocation());
		
		// have to run it first to get set info - to set info!
		f.fly();
		System.out.println(f.getCurrentLocation());
		
	}

}
