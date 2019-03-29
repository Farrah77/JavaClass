package com.class10;

public class ArrayDemo {

	public static void main(String[] args) {
		
	int[] numbers=new int[4];
	
	numbers[3]=10;
	numbers[2]=5;   //order doesn't matter unless you know the index you want to access
	numbers[0]=1;   // if we delete indexes 2 and 3, but we still say the limit is 4, it will print 0 if decide to print any of them
	numbers[1]=15;
	
	
	
	System.out.println(numbers[0]);
	
	numbers[0]=2;
	System.out.println(numbers[0]); // it prints both arrays - you can update the value. 
	}

}
