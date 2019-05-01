package com.reviewclass;

/* Create a class called Hello
     * create 1 constructor with one parameter
     * create 1 constructor with two parameters
     * create 1 constructor with three parameters
     *
     * i want you to use "this" key word and access those constructors pass values for each
     * but have one print statement for each constructor with one variable. make sure you use same
     * data type
     */

public class Hello {
	
	Hello(String a) {
		this("hello","bye");
		System.out.println("This is the value of a: "+a);
	}
    Hello (String a, String b) {
    	this("First", "Second", "Third");
    	System.out.println("This is the value of b: "+b);
    }
    Hello (String a, String b, String c) {
    	System.out.println("This is the value of c: "+c);
    }
    
    public static void main(String[] args) {
		
    	Hello obj = new Hello("A");
	}
}
