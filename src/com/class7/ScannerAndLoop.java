package com.class7;

import java.util.Scanner;

public class ScannerAndLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* prompt user to ask the name 3 times and print
 *  "You are doing great____" */


Scanner scan=new Scanner(System.in); 
String name;
int a=1; // for our counting

while (a<=3) { //condition is true and we are going inside the while loop
		System.out.println("Please enter your name");
	    name=scan.nextLine();
	    System.out.println("You are doing great "+name);
	 
	    a++; 
	 
	}
		
		
		
		
	}

}
