package com.class20;

public class InstanceVariables {
	 
   String name="John";  //instance variable - inside class - outside method
	//instance variable CAN have ACCESS Modiefiers 
	//pay attention on colors - same type of variable will be one color

	public static void main(String[] args) {
		
		String name = "Anna"; //compiler doesn't complain because it is local variable
		System.out.println(name); 
		System.out.println("----Changing value of local variable----");
		name="Olga";
		System.out.println(name);
		
		//creating first object
		//it get at first value of the instance variable, but then when change it it get new value
		//but the change doesn't affect other object we will create, only this particular
		
		InstanceVariables obj = new InstanceVariables();
		System.out.println(obj.name);
		System.out.println("---Changing value of instance-----");
		obj.name="Jack";
		System.out.println(obj.name);
		
		//creating second object 
		InstanceVariables obj1 = new InstanceVariables();
		System.out.println("-----Value of the second object-----");
		System.out.println(obj1.name); //obj1 get copy of instance variable "John"
	

	}
	
public void hello() { //no parameters so it refers to instance variable
	System.out.println("Hello "+name);
}
}
