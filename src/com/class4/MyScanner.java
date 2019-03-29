package com.class4;

import java.util.Scanner;

public final class MyScanner {
public static void main(String[] args) {
	
	Scanner input=new Scanner(System.in);
	
	System.out.println("please enter yur name");
	
	String name=input.nextLine();
	
	System.out.println("good morning "+name);
	
}
}
