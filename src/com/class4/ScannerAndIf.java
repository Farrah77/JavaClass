package com.class4;

import java.util.Scanner;

public final class ScannerAndIf {
public static void main(String[] args) {
	//take 2 number from a user and compare those numbers
	
	int num1, num2;
	
	Scanner myScanner=new Scanner(System.in);
	
	System.out.println("Please enter 1 number");
	num1=myScanner.nextInt();
	
	System.out.println("Please enter 2 number");
	num2=myScanner.nextInt();
	
	System.out.println(num1);
	System.out.println(num2);
	
	if (num1>num2) {
		System.out.println(num1+ " is bigger than "+num2);
	}else if (num1<num2) {
		System.out.println(num1+" is smaller than "+num2);
	}else 
		System.out.println(num1+" is equal to "+num2);
	
}
}
