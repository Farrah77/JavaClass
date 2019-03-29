package com.class4;

import java.util.Scanner;

public final class DmV {
//as DMV specialist ask age of the customer and issue license if customer's age is more than 18
	
	public static void main(String[] args) {
		
		int age;
		
		Scanner myScan=new Scanner(System.in);
		
		 System.out.println("Please enter age of the customer");
		 
		 age=myScan.nextInt();
		 System.out.println(age);
		 
		 if (age<18) {
			 System.out.println("Sorry,we can't issue a liense due to age restrictions");
		 } else {
			 System.out.println("Congrats! This is your Driving License");
		 }
		
	}
}
