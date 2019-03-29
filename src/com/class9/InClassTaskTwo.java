package com.class9;

import java.util.Scanner;

public class InClassTaskTwo {

	public static void main(String[] args) {
/* Ask user to enter the item they want to buy and  the price for the item. 
 * Then ask user to pay for it. Every time user enters money accumulate the 
 * amount and tell user how much is left to pay off the amount. Whenever user 
 * done with payments tell them "Thank you for shopping!"
 */
	
	Scanner scan; 
	String item;
	double price;
	double payment;
	double totalPayment=0;
	double balance;
	
	scan=new Scanner(System.in);
	
	System.out.println("Please enter your item");
	item=scan.nextLine();
	
	System.out.println("Please enter the item price");	
	price=scan.nextDouble();
	
	do {
		System.out.println("Please pay for the item");
		payment=scan.nextDouble();
		totalPayment=totalPayment+payment; 
		
		balance=price-totalPayment; 
		System.out.println("Please enter more $"+ balance);
		} 
	
	while (totalPayment!=price);
	System.out.println("Thank you for shopping");
	
	} } 	
		
		
	/* int sum = 0; //second option
	
    
    Scanner scan=new Scanner(System.in);
    System.out.println("What you are buying");
    String item=scan.nextLine();
    System.out.println("What is the price for it? ");
    int price=scan.nextInt();
    
    do {
    System.out.println("Please pay for your item");
    int price1=scan.nextInt();
        sum=sum+price1;
        System.out.println((price-sum)+" you still have to pay");
    
    }
    while (sum<price);
    System.out.println("Thank you for shopping with us");*/ 

    

