package com.class6;

import java.util.Scanner;

public class SwitchCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int num1, num2;
	int result;
	char operator;
	Scanner scan=new Scanner(System.in);
	
	System.out.println("Please enter 2 numbers");
	num1=scan.nextInt();
	num2=scan.nextInt();
	
	System.out.println("Please enter +,-,*,/");
	operator=scan.next().charAt(0);
	
	switch (operator) {
	case '+':
		result=num1+num2;
		break;
	case '-':
		result=num1-num2;
		break;
	case '*':
		result=num1*num2;
		break;
	case '/':
		result=num1/num2;
		break;
		
	default: 
		result=0;
		break;
		
	}
	
	System.out.println(num1 +" plus "+num2+" equals to "+result);
		
		
	}
	
			
	
	}


