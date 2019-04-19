package com.class25;

public class FinalKeyword {
	
	public static final String name="Syntax";
	
	public static void main(String[] args) {
		
/*
 * Final Keyword can be used in 3 places/ways:
 * 1. final variables -- we can not change their value - they are constant 
 * 2. final methods --we can not override (as well as static method) 
 * 3. final classes - we can not create a child of a final class. 
 * 
 * Variable that don't change values we call constant 
 */
	
	final String str = "Hello";
	// str = "John"; we can not change because it is final 
	//name = "School"; //calling method above - also error - it is constant
	

	}

}
