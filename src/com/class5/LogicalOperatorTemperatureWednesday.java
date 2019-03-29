package com.class5;

import java.util.Scanner;

public class LogicalOperatorTemperatureWednesday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write a program to find out what to do for the following temperatures
        // Temperatures is greater than 100 print out Stay inside it's too hot
        // temperatures is greater than 50 and less than 99 print out Wear winter clothes
        // temperatures is greater than 30 and less than 49 print out Wear winter clothes
        // temperatures is greater than 10 and less than 29 print out Stay inside it's too cold
        // lastly if the temperature  is lower than that print out Call for help it's too cold outside
	
	
	int temp;
	
	Scanner scan=new Scanner (System.in);
	
	System.out.println("What is temperature outside?");
	temp=scan.nextInt();
	
	if (temp>=100) {
		System.out.println("Stay inside its too hot");
	} else if (temp>=50 && temp<=99) {
		System.out.println("Wear summer clothes");
	} else if (temp>=30 && temp<=49) {
		System.out.println("Wear winter clothes");
	} else if (temp>=10 && temp<=29) {
		System.out.println("Stay inside it's too cold");
	} else {
		System.out.println("Call for helpit's too cold outside");
	}
	
	
	
	
	}
}


