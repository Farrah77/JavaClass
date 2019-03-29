package com.class6;

import java.util.Scanner;

public class SwitchLanguage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/* Ask where a user is from and wat language do they speak
	 * print "You speak __ language"
	 */
	
	Scanner scan=new Scanner(System.in);
	
	String country;
	String language;
	
	System.out.println("Where are from?");
	country=scan.nextLine();
	
	switch (country) {
	
	case "The Great Britain":
		language="Englih";
		break;
	case "Morocco":
		language="Arabic";
		break;
	case "Italy":
		language="Italian";
		break;
	case "Uzbekistan":
		language="Uzbek";
		break;
	case "Tajikistan":
		language="Tajik";
		break;
	default:
		language="Unknown";
		}
	System.out.println("You speak "+language+" language");
	
	}

}
