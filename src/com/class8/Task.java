package com.class8;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* let user define a range of numbers */
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the starting number");
		int startNumber=scan.nextInt();
		
		System.out.println("Enter ending number");
		int endNumber=scan.nextInt();
		
		for (int i=startNumber; i<= endNumber; i++) {
			
			System.out.println(i);
		} 
		
		/* 
		 * Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the starting number");
		int startNumber=scan.nextInt();
		
		System.out.println("Enter ending number");
		int endNumber=scan.nextInt();
		
		if (startNumber < endNumber) {
		
		     for (int i=startNumber; i<= endNumber; i++) {
		     System.out.println(i);
		} else {
		System.out.println("I won't run your code") 
		 */
	}

}
