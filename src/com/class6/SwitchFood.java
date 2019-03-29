package com.class6;

import java.util.Scanner;

public class SwitchFood {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* Ask user to enter the country of origin
 * on the base of that ask what is favorite 
 */
	
	Scanner scan; 
	scan=new Scanner(System.in);
	String country;
	String favoriteFood;
	
	System.out.println("Please enter where are you from?");
	country=scan.nextLine();
	
	switch (country) {
		
	case "USA":
		favoriteFood="Cheeseburger";
		break;
	case "Italy":
		favoriteFood="Lasagna";
		break;
	case "Turjey":
		favoriteFood="Shishkebab";
		break;
	case "Uzbekistan":
		favoriteFood="Shashlyk";
		break;
	
	case "Tajikistan":
		favoriteFood="Shurbo";
		break;
     default: 
    	 favoriteFood="Unknown";
    	 }
	System.out.println("Your favorite food is "+favoriteFood);
	
	
	
	
	}

}
