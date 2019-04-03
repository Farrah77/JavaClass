package com.class15;

public class Phone {
	
	String brand, os, model;
	int storage;
	boolean camera; 
	
	public static void main(String[] args) {
		
		Phone phn1 = new Phone();
		System.out.println("--------Phone 1--------");
		phn1.brand="Nokia";
		phn1.os = "XXX";
		phn1.model="7979";
		phn1.storage=1;
		phn1.camera=false;
		//define behavior
		phn1.text();
		phn1.call();
		
		System.out.println("---------Phone 2--------");
		Phone phn2 = new Phone();
		phn2.brand="Apple";
		phn2.os="iOS";
		phn2.model="iPhone";
		phn2.storage=16;
		phn2.camera=true;
		//define behavior
		phn2.text();
		phn2.call();
		
		System.out.println("---------Phone 3---------");
		Phone phn3 = new Phone();
	
		phn3.brand="Samsung";
		phn3.os="Android";
		phn3.model="Galaxy";
		phn3.storage=16;
		phn3.camera=true;
		
		phn3.text();
		phn3.call();
		
	}
	void text() {
		System.out.println("You can text with your "+brand+" phone");
	}
	void call() {
		System.out.println("You can call with your "+brand+" phone");
	}
    
}
