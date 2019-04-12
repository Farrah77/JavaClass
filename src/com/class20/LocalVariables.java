package com.class20;

public class LocalVariables {

	public static void main(String[] args) {
	
		String name = "John"; 
		
		
		LocalVariables obj = new LocalVariables(); //local variable available only within the same method
		                                           //as soon as you exit the method variable no longer exists
		obj.hello(name); //Hello Jack
		System.out.println(name);

	}
	
	//create a non static method available everywhere
	
	public void hello(String name) { // first executes this method 
		name="Jack";
		
		System.out.println("Hello "+name);
		
	}

}
