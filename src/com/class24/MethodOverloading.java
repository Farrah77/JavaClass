package com.class24;

/* 
 * Create 1 class with a static method that has 3 overloaded forms. 
 * Then call each overloaded method with specific arguments and observe result.
 */

public class MethodOverloading {
	
	public static void getInfo() {
		System.out.println("I am method with no parameters");
	}
	public static void getInfo(String a) {
		System.out.println("I am method with String type parameter "+a);
		
	}
	public static void getInfo(int a) {
		System.out.println("I am method with integer type parameter "+a);
	}
	
	public static void main(String[] args) {
		
		
		MethodOverloading obj = new MethodOverloading();
		obj.getInfo();
		obj.getInfo("Spring");
		obj.getInfo(7);
	}
 
}
