package com.qa.eylemjavapractice.generics;

public class Student<T> {

	private T name;
	
	public void set(T name) {
		this.name = name;
	}
	
	public T get(){
		return name;
	}
	
	
	// add getters and setters for the generic T
	
}



/* 
public main
Student<String> instance= new Student<String>();
instance.set(name: "Bob"); // correct usage
//instance.set(1);
sysout(instance.get());
*/


/*public main 
Student<float> instance= new Student<String>();
instance.set(name: 1); // correct usage
//instance.set(1);
sysout(instance.get());
*/
/* class is  generic--- therefore can chose what we want

Getters and setters and also need to be the same type!


*/