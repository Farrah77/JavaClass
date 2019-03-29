package com.reviewclass;

public class NestedLoopTask2 {

	public static void main(String[] args) {
		/* print the pattern:
		 *  ....1
		 *  ...22
		 *  ..333
		 *  .4444
		 *  55555
		 */

	for (int i=1; i<=5; i++) {
		
		for (int b=1; b<=5-i; b++) {
	
	         System.out.print(".");
		} 
	         for (int l=1; l<=i; l++) {
	        	  System.out.print(i);
	         }
	  System.out.println();
	} 

	} }
