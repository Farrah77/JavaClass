package com.class9;

import java.util.Scanner;

public class InClassTaskSix {

	public static void main(String[] args) {
		// Ask a user to input a leap year. Give the user 10 chances 
		// to enter a correct leap year. As soon as the user enters the 
		// correct leap year exit the loop.

		
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
	}} 

/* inClass version 
 * Scanner scan=new Scanner (System.in);
 * int year;
 * 
 * because we ask to enter 10 times we use FOR loop - we know exactly the number of iterations
 *
 * 
 * for (int a = 1; a <= 5; a++) {
            System.out.println("Please Enter Year");

            year = scan.nextInt();

            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println("Is leap Year");
                break; 
                
            } else {
                System.out.println("Is Not leap Year");

                {
                }
            }
        }
 *
 */ 
