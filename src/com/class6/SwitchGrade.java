package com.class6;

import java.util.Scanner;

public class SwitchGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* enter grade and explanation: A-good, B-not bad...
 * 
 */
		
		Scanner scan=new Scanner(System.in);
		String grade;
		String explanation;
		
		System.out.println("Please enter your grade");
		grade=scan.nextLine();
		
		switch (grade) {
		case "A":
			explanation="Excellent";
			break;
		case "B":
			explanation="Good";
			break;
		case "C":
			explanation="Average";
			break;
		case "D":
			explanation="Bad";
			break;
			default:
				explanation="Not Acceptible";
				
		}
		
		System.out.println("Your grade is "+grade+" and it is "+explanation);
	}

}
