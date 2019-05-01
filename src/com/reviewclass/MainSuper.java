package com.reviewclass;

public class MainSuper {
	
	MainSuper(String a) {
		System.out.println("Parent class with one parameter: "+a);
	}
	MainSuper(String a, String b) {
		System.out.println("Parent class with two parameters: "+b);
	}
	
     public static void main(String[] args) {
		
		ChildSuper obj = new ChildSuper("hello","bye");
		ChildSuper obj1 = new ChildSuper("yes");
	}

}
 class ChildSuper extends MainSuper {
	
	ChildSuper(String a) {
		super(a);
		System.out.println("Child class with one parameter: "+a);
	}
	ChildSuper(String a, String b) {
		super(b);
		System.out.println("Child class with two parameters: "+b);
	}
	
}
