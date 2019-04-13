package com.class22;

public class Car {
	
	public static String make="Toyota";
	String color;   //instance variable
	String model;
	int doors;
	boolean engine;
	
	Car() { //we are creating our own constructor. It can have its own block of codes
		
		System.out.println("I am a CONSTRUCTOR"); 
		System.out.println("Hello from Costructor");
	}
	
 public static void main(String[] args) {

	 
	 Car obj =new Car();
	 System.out.println(obj.color); //compiler gives value by default to uninitialized variables - String -null
	 System.out.println(obj.doors);//int - 0
	 System.out.println(obj.engine); // boolean - false
	 hello();
		
	} 
 
 public static void hello() {
	 //before having any variable we have to initialize it
	 String name;
	 //System.out.println(name) - compiler will give error
	 System.out.println("I am Static Hello method");
 }
	

}
