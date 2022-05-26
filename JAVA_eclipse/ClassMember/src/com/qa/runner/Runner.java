package com.qa.runner;

import com.qa.customer.Customer; 


public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Creating a customer object
		Customer cust = new Customer();
		Customer personOne = new Customer("John", "Lewis", 100);
		
		//Getting the information from personOne
		System.out.println(personOne.getAge());
		System.out.println(personOne.getForeName());
		System.out.println(personOne.getSurName());
		
		// setting values for customer;
		cust.setAge(19);
		cust.setForename("Jake");
		cust.setSurname("Bake");
		
		System.out.println("=====================");
		
		// printing the new set values of customer
		System.out.println(cust);
		
		
				
		
//		cust.customerInfo();
//		
//		System.out.println(cust.age);
		
//		System.out.println(cust.getEmail());
//		cust.setEmail("test@test.com");
//		System.out.println(cust.getEmail());
		
	}

}
