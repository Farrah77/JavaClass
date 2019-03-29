package com.class4;

public class MortgageRate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* Create a Java program and store variables to store mortgage rate 
 * and mortgage price. First program should check if rate is higher 
 * than 4.5 user will not buy a house, otherwise user will consider 
 * buying. Once user decides to buy a house, if price of the house 
 * is larger than 200000 than user will take a loan, otherwise user 
 * will pay cash.
 */
	
		double rate=3.5;
		double price=250.000; 
		double expRate=4.5;
		double expPrice=200.000;
		
		if (rate>expRate) {
			System.out.println("I can not buy this house");
		}else
			System.out.println("I will consider");
		     if (price>expPrice) {
		    	 System.out.println("I have to apply for a loan");
		     }else {
		    	 System.out.println("I can pay cash");
		     }
		
	}

}
