package com.class9;

import java.util.Scanner;

public class InClassTaskOne {

	public static void main(String[] args) {
		/*  Write a program that reads a range of integers (start and end point), 
		 * provided by a user and then from that range prints the sum of the even 
		 * and odd integers.
		*/
/* int sum=0;
		
		for (int a=1; a<=5; a++) {
			
			sum=sum+a;
		}
	System.out.println(sum);
	
	//find sum of all even numbers from 1 to 100
	
	int sum1=0;
	
	for (int i=1; i<=100; i+=2) {
		 sum1=sum1+i;
		}
	System.out.println(sum1);
	} */

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

/* Second option.
        Scanner input;
        int startPoint;
        int endPoint;
        int sumofEven = 0;
        int sumofOdd = 0;
        input = new Scanner(System.in);
        System.out.println("Enter your start point: ");
        startPoint = input.nextInt();
        System.out.println("Enter your end point: ");
        endPoint = input.nextInt();

        if (startPoint < endPoint) {
            
            for (int a = startPoint; a <= endPoint; a++) {
                if (a % 2 == 0) {
                    sumofEven += a;
                } else {
                    sumofOdd += a;
                }

            }
            
            System.out.println(" Your sum of even numbers are: " + sumofEven);
            System.out.println(" Your sum of odd numbers are: " + sumofOdd);
            
            */ 


