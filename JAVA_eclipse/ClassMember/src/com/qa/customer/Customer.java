package com.qa.customer;

public class Customer {
	
	// Attributes - when we have a private attribute , we need Getter and Setters to access them in the runner
	private String firstName; 
	private String lastName;
	private int age;
	
	// default constructors
	public Customer() {

	}

	// Constructor
	
	public Customer(String forename, String surname, int experience ) {
		this.firstName = forename;
		this.lastName = surname;
		this.age = experience;
		
	}
	
	
	//Getter and Setter - Allow you to access the private attributes from the runner class
	
	public String getForeName() {
		return firstName;
	}
	
	
	public void setForename (String firstName ) {
		this.firstName = firstName;
	}

	
	public String getSurName () {
		return lastName;
	}
	
	public void setSurname(String lastName) {
		this.lastName = lastName;
		
	}
	
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	//ToString method allows us to see the whole object details/attributes (name, age etc)
		// "\n" inside the String will start a new line
	// toString
	@Override
	public String toString() {
		return "Customer [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + "]";
		
	}

	
	// Methods
	//	1
	public void message() {
		System.out.println("This is cool");
		
	}
	//	2
	public void newMessage( ) {
		System.out.println("This is tough");
	}
	
	
}
