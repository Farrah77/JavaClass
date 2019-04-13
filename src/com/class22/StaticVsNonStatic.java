
package com.class22;

public class StaticVsNonStatic {
	
	public String name="John"; //instance variable
	
	public static String lastName="Snow"; //static variable
	
	public static void main(String[] args) {
		
		StaticVsNonStatic obj = new StaticVsNonStatic();
		obj.getInfo();
		
		getInfo1(); //can call the method by its method/variable name
		System.out.println(lastName); //we access by its name
		System.out.println(obj.name); //we access through object 
	}
	//non static method can access both instance and static variables
	public void getInfo() {   
		System.out.println("My name is "+name+" and my last name is "+lastName);
		//getInfo1(); - we can access static method within non static 
	}
	//static method can have an access to static variables
	public static void getInfo1() { 
//not correct //System.out.println("My name is "+name+" and my last name is "+lastName);
	System.out.println("I am a static method"); //to execute this code we have to call it,in main mathod
	// getInfo(); - compiler error - we can't access non static method within static
	}
}