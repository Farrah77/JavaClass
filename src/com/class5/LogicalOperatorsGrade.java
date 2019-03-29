package com.class5;

import java.util.Scanner;

public class LogicalOperatorsGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int quiz;
		int mid;
		int finalTest;
		
		
		Scanner myscan=new Scanner(System.in);
		
		System.out.println("Please enter quiz score");
		quiz=myscan.nextInt();
		
		System.out.println("Please enter mid term score");
		mid=myscan.nextInt();
		
		System.out.println("Please enter final test score");
		finalTest=myscan.nextInt();
		
		int avgScore=(quiz+mid+finalTest)/3;
		
	System.out.println("Your average score is "+avgScore);
	
		if (avgScore>=90) {
			System.out.println("Your grade is A");
		} else if (avgScore>=70 || avgScore<90) {
			System.out.println("Your grade is B");
	 	} else if (avgScore>=50 && avgScore<70) {
			System.out.println("Your grade is C");
		}else if (avgScore<50) {
			System.out.println("Your grade is F");
		} else {
			System.out.println("Data not valid");
		}
		
		
		
		
		
		
			
	}

}
