package com.class9.demo;

import java.util.Scanner;

public class InClassTaskFive {

	public static void main(String[] args) {
		/* Write a guessing game where the user has to guess a secret 
		 * number between 1 and 20. After every guess input, the program 
		 * tells the user whether their number was too large or too small. 
		 * The program will keep asking the user to enter the number 
		 * until he finds the correct number. When the correct answer is 
		 * found the system should display "Congratulations!!. You got it!".
		 */

	
		Scanner scan=new Scanner(System.in); 
		
 
	int secret, userNumber; 
	
	secret=13;
	
	do {
		System.out.println("Please guess the number from 1 t 20");
		userNumber=scan.nextInt();
		
		if (userNumber<secret) {
			System.out.println("Your number is too small");
		} else if (userNumber>secret) {
			System.out.println("Your number is too large");
			
		} } while (secret!=userNumber); 
		
		System.out.println("Congratulations! You got it");
	} } 
	
	
	 
/* int a=12;   // another option - more correct
 int b;
 
 for (int x=1; x<=20; x++) {

 System.out.println("Please guess the number");
 b=scan.nextInt();
 
	
	      if (b<a) {
            System.out.println("Your number is too small"); }
	      
	      else if (b>a) {
	    	  System.out.println("Your number is too large"); }
	      else if (b==a) {
	    	  System.out.println("Congratulations! You got it!");  
	    	  break;
	      }
	      } */
	    	  
	    	  
	    	  

