package com.class9.demo;

import java.util.Scanner;

public class InClassTaskOne {

	public static void main(String[] args) {
	InClassTaskOne obj=new InClassTaskOne();
	obj.enterNumber();

	}
	
	void enterNumber() {
		Scanner scan=new Scanner(System.in); 
		int startRange;
		int endRange;
		int sumEven=0;
		int sumOdd=0;
		
		System.out.println("Please enter the start point");
		startRange=scan.nextInt();
		
		System.out.println("Please enter the end point");
		endRange=scan.nextInt(); 
			    
	   for (int a=startRange; a<=endRange; a++) {
			if (a%2==0) {
				sumEven=sumEven+a;
			} else {
				sumOdd=sumOdd+a;
				
			}
				
		}
			
		System.out.println("The sum of even numbers equal to "+sumEven);	
		System.out.println("The sum of odd numbers equal to "+sumOdd);
		}
		
		
	}
	



