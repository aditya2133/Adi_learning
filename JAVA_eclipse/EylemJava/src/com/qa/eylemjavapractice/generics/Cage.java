package com.qa.eylemjavapractice.generics;

public class Cage<T> {

	private T object;
	
	public void add(T object) {
		this.object=object;
	}
	
	
	public T get() {
		return object;
	}
}
