package com.class14;

import java.util.Scanner;

public class Task7Prime {

	public static void main(String[] args) {
		
		int num;
	    boolean isPrime=true;
	    
	    Scanner scan=new Scanner(System.in);
	    System.out.println("Please enter a number");
	    num=scan.nextInt();
	    
	    for (int i=2; i<num; i++) {   //or i<num/2;
	        
	        if (num%i==0) {
	            isPrime=false;
	            break;
	        }
	    }
	    if (isPrime)  {
	        System.out.println(num+" is a prime number!");
	    }else {
	        System.out.println(num+" is NOT a prime number!");
	    }

	}

}
