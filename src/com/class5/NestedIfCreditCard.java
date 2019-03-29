/**
 * 
 */
/**
 * @author farrah
 *
 */
package com.class5;

public class NestedIfCreditCard {

public static void main(String[] args) {

	//Ask if person has a credit card. If yes, ask what is the balance
	//if balance is more than 1000 -> pay off now. If less ->you're good.
	
	boolean creditCard=true;
	int balance=1000;
	
	if (creditCard) {
		System.out.println("Let's check your balance");
		
		if(balance>=1000) {
			System.out.println("You can pay off now");
		} else {
				System.out.println("You are good");
			}
	} else {
		System.out.println("Do you want to apply for a credit card?");
	}
	
	
}}