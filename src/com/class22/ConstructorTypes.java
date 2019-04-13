package com.class22;

public class ConstructorTypes {

	//ConstructorTypes() {
		//System.out.println("I am a Constructor with NO parameters");
		
	//}
	
	ConstructorTypes(String str) { //local variable inside constructor
		System.out.println("I am aconstructor with 1 parameter "+str);
	}
	
	ConstructorTypes(int a, String str) { //parameterized constructor
		System.out.println("I am a constructor with 2 parameters "+a+" and "+str);
	}
	
	public static void main(String[] args) {
		
		ConstructorTypes obj1 = new ConstructorTypes("String1");
		
		ConstructorTypes obj2 = new ConstructorTypes("String");
		ConstructorTypes obj3 = new ConstructorTypes(123, "String");
	}
}
