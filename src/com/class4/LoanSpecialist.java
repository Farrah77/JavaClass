package com.class4;

import java.util.Scanner;

public final class LoanSpecialist {
public static void main(String[] args) {
	//loan specialist to give less than 200,000, reject if bigger amount
	
	int loan;
	
	Scanner myScanner=new Scanner (System.in);
	
	System.out.println("Please enter the loan amount");
	
	loan=myScanner.nextInt();
	
	System.out.println(loan);
	
	if (loan<200.000) {
		System.out.println("Congrats! You can have a loan");
	} else {
		System.out.println("Sorry, the amount required exceeds your limit");
	}
		
	
	
	
			
}
}
