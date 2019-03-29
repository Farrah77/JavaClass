package com.class4;

import java.util.Scanner;

public final class CityAndTemperature {
public static void main(String[] args) {
	
	/*
	* Ask user to enter city and temperature in Fahrenheit
	* Your program should convert F-->C
	* Your program should say “The temperature in the city ___is ___”
	*/
	
	Scanner scan=new Scanner(System.in);
	 String cityName;
	 int temp;
	 
	 System.out.println("Please enter city name");
	 
	 cityName=scan.nextLine();
	 
	 System.out.println("Please enter temperature");
	 
	 temp=scan.nextInt();
	 
	 System.out.println("Temperature in "+cityName+" is "+temp+"F");
	 
	 //convert to Celcious 
	 //formula (temp-32)*5/9
	 
	 int convertedTemp=(temp-32)*5/9;
	 
	 System.out.println("Temperature in "+cityName+" is "+convertedTemp+"C");
	 
}
}
