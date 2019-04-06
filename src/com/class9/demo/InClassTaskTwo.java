package com.class9.demo;

import java.util.Scanner;

public class InClassTaskTwo {

	public static void main(String[] args) {
		InClassTaskTwo obj=new InClassTaskTwo();
		
		obj.shop();

	}
	
	void shop() {
		
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
		
		
	
    

