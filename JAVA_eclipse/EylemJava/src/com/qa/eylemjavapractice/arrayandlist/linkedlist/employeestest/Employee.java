package com.qa.eylemjavapractice.arrayandlist.linkedlist.employeestest;

import java.util.Objects;

public class Employee {

	public String name;
	public String address;
	public String hobbies;
	
	
	
	public Employee() {
		super();
	}


	public Employee(String name, String address, String hobbies) {
		super();
		this.name = name;
		this.address = address;
		this.hobbies = hobbies;
	}



	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}


	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}


	/**
	 * @return the hobbies
	 */
	public String getHobbies() {
		return hobbies;
	}


	/**
	 * @param hobbies the hobbies to set
	 */
	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}

	
	

	@Override
	public String toString() {
		return "Employee [name=" + name + ", address=" + address + ", hobbies=" + hobbies + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(address, hobbies, name);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Employee other = (Employee) obj;
		return Objects.equals(address, other.address) && Objects.equals(hobbies, other.hobbies)
				&& Objects.equals(name, other.name);
	}
	
	
	
//	LinkedList<String> staff = new LinkedList<>();
//	
//	
//	
//	Map<String, String, String> emp1 = new HashMap<>();
//	
//	
//	public static ArrayList<String> hobb() {
//		
//		ArrayList<String> hobbies = new ArrayList<>() ;	
//		hobbies.add("football");
//		hobbies.add("basketball");
//		hobbies.add("baseball");
//		return hobbies;
//	}
	
	
		
	
	
}
