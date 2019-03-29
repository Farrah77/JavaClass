package com.class6;

public class NotOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* ! isa not operator - doing opposite 
 * 
 */
	
	boolean a=!true;
	
	System.out.println("The value of boolean variable is "+a);
	
	boolean snow=true;
	
	//if it's not snowing -> i'll go to class, otherwise I'stay home
	
	if (!snow) {
		System.out.println("I'll go to class"); //will not execute since it's false
	}
		
	int x=10;
	int y=20;
	
	if (!(x>y)) {
		System.out.println("Hello");
	}
	}

}
