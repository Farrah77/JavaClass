
package com.class9.demo;

public class NestedLoop {
	
	public static void main(String[] args) {
		
		NestedLoop obj = new NestedLoop();
		obj.print();
		
	} void print() {
		
	for (int i=0; i<3; i++) {
		for (int y=0; y<3; y++) {
	    	System.out.println("I am inner loop");
	    } 
	    System.out.println("----------I am outer loop----------");
	}

	
	 } 
}