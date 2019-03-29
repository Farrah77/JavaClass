package com.reviewclass;

public class ArrayTask2Boolean {

	public static void main(String[] args) {
		/*       * Write a program to test if an array contains a specific value.
        *
        * Hint: use a boolean flag
        */
		
		int[] num = {1,2,3,4,5,6,7,8,9,10};
		
		boolean found=false; //boolean flag (we look at the elements, we set the flag to true, then we break it. 
		
		for (int a=0; a<num.length; a++) {
			if (a==6) {
				found=true;
				break; } }
			
			if (found==true) {
				System.out.println("The array contains the value 6");
			} else {
				System.out.println("The array do not contain the value 6");
			}
		} 
		

	}


