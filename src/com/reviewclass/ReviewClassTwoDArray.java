package com.reviewclass;

public class ReviewClassTwoDArray {

	public static void main(String[] args) {
		//        Write a program to print the length of each array.

	       int[][] ar = { { 1, 2, 3 }, { 4, 5, 6, 9 }, { 7, 8 }, };

	       System.out.println("Length of row 1: " + ar[0].length);
	       System.out.println("Length of row 2: " + ar[1].length);
	       System.out.println("Length of row 3: " + ar[2].length);

	       for (int[] innerArr : ar) {
	           int i = 1;
	           System.out.println("Length of row " + i + ": " + innerArr.length);
	           i++;
	       }

//	             Write a program to Print all elements of 2d array Using Loop

	       for (int i = 0; i < ar.length; ++i) {
	           for (int j = 0; j < ar[i].length; ++j) {
	               System.out.println(ar[i][j]);
	           }
	       }

	       for (int[] innerArray : ar) {
	           for (int data : innerArray) {
	               System.out.println(data);
	           }
	       }
	}

}
