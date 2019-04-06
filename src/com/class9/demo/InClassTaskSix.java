package com.class9.demo;

import java.util.Scanner;

public class InClassTaskSix {

	public static void main(String[] args) {
		
		InClassTaskSix obj = new InClassTaskSix();
		
		obj.isItLeapYear();
	
	}
	void isItLeapYear() {
		int leapYear; 
		
		
		Scanner scan=new Scanner(System.in);
		
		for (int a=1; a<=20; a++) {
			
			System.out.println("Please enter the year");
		leapYear=scan.nextInt();
		
		 if (leapYear%4!=0) {
			 System.out.println("It is not leap year, please try again");
		 } else if (leapYear%4==0) {
			 System.out.println("It is the leap year, you got it right!");
			 break; 
		 }
		}
		
		
	}
	

} 

