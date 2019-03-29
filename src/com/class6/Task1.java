package com.class6;

import java.util.Scanner;

public class Task1 {

		// TODO Auto-generated method stub
/* write a program that prints out if it is a good weather to go out
 * 
 * If the temperature is between 40 and 80 inclusive & no rain -> hiking,
 * otherwise ->no hiking
 * If temperature is between 25 and 40 deg inclusive and snowing->going snow-boarding,
 * otherwise no snow boarding
 * if temperature is more than 80 & sunny -> we'll go to the beach, otherwise
 * no beach.
 */
	
	public static void main(String[] args) {
	
	Scanner scan; 
	boolean snow, rain, sunny;
	int temp;
	String activity;
	
	scan=new Scanner(System.in);
	
	System.out.println("Please enter the temperture");
	temp=scan.nextInt();
	
	
	
	if (temp>=40 && temp<=80) {
		System.out.println("Is it raining?");
	    rain=scan.nextBoolean(); 
		if (rain) {
			System.out.println("No hiking - do coding");
		} else {
			System.out.println("Let's go hiking");
		}
	} 
	else if (temp>=25 && temp<40) {
		System.out.println("Is it snowing?");
	    snow=scan.nextBoolean();
		if (snow) {
			System.out.println("Let's go snowboarding");
		} else {
			System.out.println("No snow boarding - do coding");
		}
	} 
	else if (temp>80) {
		System.out.println("Is it sunny?");
           sunny=scan.nextBoolean();
			if (sunny) {
				System.out.println("Let's go to the beach");
			} else {
				System.out.println("More coding");
			}
		} else {
			System.out.println("activity is unknown");
		}

	    
	}

}
