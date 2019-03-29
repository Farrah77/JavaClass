package com.class4;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//write a program to check work eligibility 
//if user is younger than 16 - not allowed to work, otherwise -allowed
		// if user is younger than 64 - go to work, otherwise ->enjoy your work
		
		int age=18;
		int eligibleAge=16;
		int retAge=64;
		
		if (age<eligibleAge) {
			System.out.println("You are too young to work");
		}else {
			System.out.println("You are eligible to work");
			if (age<retAge) {
				System.out.println("Go wor hard");
			} else 
				System.out.println("Enjoy your life, you don't have to work!");
		}
		
	}

}
