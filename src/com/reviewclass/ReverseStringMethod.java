package com.reviewclass;

public class ReverseStringMethod {
	
/* * Create a String method called ReverseString
     *  method return the string you hard coded
     * in reverse order(This is the static way)
     * have the string you will create will say
     * "seigolonhceT xatnyS" */
	
	String a="Syntax Technologies";
	String reverse=""; 
	
	public static void main(String[] args) {
	
	ReverseStringMethod str=new ReverseStringMethod();
	str.ReverseStringMethod();

} void ReverseStringMethod() {
	for (int i=a.length()-1; i>=0; i--) {
		reverse+=a.charAt(i); }
		System.out.println(reverse);
	}
}

