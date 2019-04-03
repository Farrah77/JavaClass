package com.class14;

public class Task6 {

	public static void main(String[] args) {
	// Palidrome 
		
	String str = "madam";
	String reverse = "";
	
	for (int i=str.length()-1; i>=0; i--) {
		reverse+=str.charAt(i); 
	} System.out.println(reverse);
	  
	if (reverse.equalsIgnoreCase(str)) {
		System.out.println(str+ " is a Palidrome");
		} else {
			System.out.println("Not a Palidrome");
		}
		
	

	}

}
