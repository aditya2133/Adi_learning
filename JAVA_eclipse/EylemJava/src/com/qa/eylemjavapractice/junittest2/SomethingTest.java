package com.qa.eylemjavapractice.junittest2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.qa.eylemjavapractice.junittest1.*;

public class SomethingTest {

	 Something some1 = new Something();
	
	
	@Test
	public void addTest(){
		
		int c;
		c=some1.add();
		assertEquals("Nah", 3, c);
		
	}
	
	@Test
	public void subtractTest() {
		
		int c;
		c= some1.subtract();
		assertEquals("mah", -1, c);
	}
	
	@Test
	public void eylemaddTest() {
		int c;
		c = some1.eylemadd(2,4);
		assertEquals(6,c);
		
	}
	
	
}
