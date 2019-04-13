package com.class22;

public class CallingStaticVsNonStatic {

	public static void main(String[] args) {
		
		StaticVsNonStatic obj = new StaticVsNonStatic();//reference obj from previous class
		//accessing non static member
		System.out.println(obj.name); 
		
		//access static members by using class name they belong to
		System.out.println(StaticVsNonStatic.lastName); 
		StaticVsNonStatic.getInfo1(); //it is available because it is static
	}

}
