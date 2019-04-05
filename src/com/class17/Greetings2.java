package com.class17;

import java.util.Scanner;

public class Greetings2 {

	public static void main(String[] args) {
	// Create a method that will take 2 parameters as a numbers 
	// and prints which number is larger.
		
	Greetings2 obj = new Greetings2();
	obj.isLarger(35,45);
	obj.evenOdd(7);
	obj.palindrome("madams");
	}
	
	void isLarger(int a, int b) {
		if (a>b) {
			System.out.println(a+" is larger that "+b);
			
		} else {
			System.out.println(b+" is larger than "+a);
		}
	}

	void evenOdd(int num) {
		
		if (num%2==0) {
			System.out.println(num+" is even");
		} else 
			System.out.println(num+" is odd");
	}
	void palindrome (String word) {
		String reverse="";
		for (int i=word.length()-1; i>=0; i--) {
			reverse=reverse+word.charAt(i);
		}
		if (reverse.contentEquals(word)) {
			System.out.println(word +" is a palindrome");
		} else {
			System.out.println(word +" is not a palindrome");
		}
	}

}
