package com.reviewclass;

import java.util.Scanner;

public class ReviewClassSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	
		int day=3;
		String dayName;

		
		switch (day) {
	
	     case 1: 
			dayName="Monday";
			break;
		case 2:
			dayName="Tuesday";
			break;
		case 3: 
			dayName="Wednesday";
			break;
		case 4:
			dayName="Thursday";
			break;
		case 5:
			dayName="Friday";
			break;
		default:
			dayName="Weekend";
			
	}
		System.out.println("Today is "+dayName);

} }
