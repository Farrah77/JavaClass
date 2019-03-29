package com.class4;

import java.util.Scanner;

public final class SalaryBonus {

	/*Write a program to ask user to enter numbers of worked years 
	 * and annual salary. If user worked for more or equals to 5 years
	 *  than user is eligible for the bonus, otherwise he is not. 
	 *  Once user is eligible and salary is larger than 50000 than 
	 *  bonus = 5000, otherwise bonus=3000.
	 */
	
	public static void main(String[] args) {
		
		int years; 
		int salary;
		int reqYears=5;
		int reqSalary=50000;

		
		Scanner myscan=new Scanner(System.in);
		System.out.println("Please enter employees number of worked years");
		
		years=myscan.nextInt();
		
		System.out.println("Please enter employees accumulated salary");
		
		salary=myscan.nextInt();
		
		 
		if (years>=reqYears) {
			System.out.println("You can apply for a bonus");
			 if (salary>=reqSalary) {
				 System.out.println("Your bonus is 5000");
			 }else {
				 System.out.println("Your bonus is 3000");
			 }
			} else 
				System.out.println("You can't apply for a bonus");
		
		
	}
}
