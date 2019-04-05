package com.reviewclass;

import java.util.Scanner;

public class ReviewMethods {

	//Create a method that has no return type
	//Hint do not use system.out.println("   ")
	
	public static void main(String[] args) {   //methods make codes look cleaner
	ReviewMethods object =new ReviewMethods();
	
	
	object.noReturn();
	object.scannerFirstName();
	object.scannerFirst();
	
    }
	
	void noReturn() {
		System.out.println("I do not have a return type");
	}
  void scannerFirstName() {
	  Scanner scan=new Scanner(System.in);
	  scan.hasNextLine();
  }
  void scannerFirst() {
	  Scanner scann = new Scanner(System.in);
	  scann.hasNextInt();
  }
}