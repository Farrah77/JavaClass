
package com.class7;

public class CompoundOperator {
	
	public static void main(String[] args) {
	
	int a=100;
	a=a+100;
	
	System.out.println(a); //200 (java executes from top to the bottom
	                       //first we assigned value, then re-assign it
	                       //however, there shorter way to write it.
	
	int b=100;
	b+=100;
	 System.out.println(b); //output will be 200 (system count b+b)
	 
	 int d=100;
	 
	 d+=30;
	 System.out.println(d);
	 d*=5;
	 System.out.println(d);
	 d-=10;
	 System.out.println(d);
	 d/=5;
	 System.out.println(d);
}
}