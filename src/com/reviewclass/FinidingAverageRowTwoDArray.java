package com.reviewclass;

public class FinidingAverageRowTwoDArray {

	public static void main(String[] args) {
//                    Write a program to find the average of row 2.
//      2 6 9 3 7
//      1 7 9 4 8
//      0 4 6 2 5
//      0 1 2 3

		
		int[][] rating = { 
				{ 2, 6, 9, 3, 7 }, 
				{ 1, 7, 9, 4, 8 }, 
				{ 0, 4, 6, 2, 5 }, 
				{ 0, 1, 2, 3 } 
				};
		
        
		 int total=0;
	        
	        for (int i=0; i<rating.length; i++) {
	            total+= (rating[1][i]);
	        }
	        
	        int average=total/rating.length;
	        
	        System.out.println("The average is "+average);
		}
	}


