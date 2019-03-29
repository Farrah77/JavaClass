package com.class11;

import java.util.Scanner;

public class ForLoopsTask2 {

	public static void main(String[] args) {
/* Create an array of countries. While retrieving all values from an array print 
* capital for each country. (use 2 different loops)
*/
		
		Scanner scan=new Scanner(System.in);
		
		String capital;
		
		String[] country = {"Russia", "Canada", "USA", "China", "Australia"}; 

		System.out.println("-------------Advanced For Loop----------");
		for (String state:country) {
			
			System.out.println(state);
			capital=scan.nextLine();
		}
		
		String[] countries = {"Spain", "France", "Italy", "Greece", "Turkey"};
		
		System.out.println("-----------Regular For Loop-------------");
		for (int i=0; i<countries.length; i++) {
			System.out.println(countries[i]+" ");
			capital=scan.nextLine();
		}
	}

}
