
package com.class30;

public class WrapperClass {
	
	public static void main(String[] args) {
		
		Integer integer1 = new Integer(10);//boxing 
		System.out.println(integer1);
		
		Integer integer2=10; //Autoboxing 
		
		int num=integer1.intValue(); //unboxing
		System.out.println(num);
		
		int num2 = integer2; //autoboxing
	}
}