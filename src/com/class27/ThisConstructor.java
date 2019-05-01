package com.class27;

/*
 * Write program as a student class   that has instance variables name and 
 * address. Create a constructor that will initialize those variables. 
 * Print name & address of given  student by the displayInfo method.
 */

public class ThisConstructor {
	String name;
	String address;

	ThisConstructor(String name, String address) {
		this.name = name;
		this.address=address;
	}
	
	public void displayinfo() {
		System.out.println("Student name "+name+" and address is "+address);
	}
	
	public static void main(String[] args) {
		ThisConstructor obj =new ThisConstructor("John Snow", "1111 Northern Kindgom");
		obj.displayinfo();
		
	}
}