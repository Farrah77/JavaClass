
package com.class6;

import java.util.Scanner;

public class HomeWork1 {
	
	public static void main(String[] args) {
	
	/* write a program to find largest of three double 
	 * values using if-else. 
	 * If provided by a user (numbers to be distinct
	 */
	
	double num1, num2, num3;
	
	Scanner myscan=new Scanner(System.in);
	
	System.out.println("please enter 3 double values");
	 
	num1=myscan.nextDouble();
	num2=myscan.nextDouble();
	num3=myscan.nextDouble();
	
	if (num1>num2 && num1>num3) {
		System.out.println(num1+ " is the largest number");
	} else if (num2>num1 && num2>num3) {
		System.out.println(num2+" is the largest number");
	} else if(num3>num1 && num3>num2) {
	} System.out.println(num3+" is the largest");
	
} }