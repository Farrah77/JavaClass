package com.class5;

import java.util.Scanner;

public class LogicalOperatorAndHeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* ask a person his height 
 * if under 5 ->short
 * between 5-6 -> medium
 * more than 6 -> tall
 */
	
	int height;
	
	 Scanner myscan=new Scanner(System.in);
	
	System.out.println("Plese enter your height");
	height=myscan.nextInt();
	
	if (height>0 && height<5) {
		System.out.println("You are short");
	} else if (height>=5 && height==6) {
		System.out.println("You are medium height");
	} else if (height>6) {
		System.out.println("You are tall");
	} else {
		System.out.println("Not valid data");
	}
	
	
	
	}

}
