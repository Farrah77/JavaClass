package com.class14;

public class Task2secondLargestNumber {

	public static void main(String[] args) {
		    
		
		    int arr[] = { 1,40,20,4,5};
	        int largest = arr[0];
	        int secondLargest = 0;
	        int min = arr[0];
	        
	        for (int i = 0; i < arr.length; i++) {

	            if (arr[i] > largest) {
	                secondLargest = largest; //we equalize 2nd Largest with Max for loop to compare
	                largest = arr[i];

	            } else if (arr[i] > secondLargest) {
	                secondLargest = arr[i];
	            }
	            if(min > arr[i] ) {
	                min = arr[i];
	            }
	        }
	        System.out.println("Min number is: "+min);
	        System.out.println("Largest number is: "+ largest);
	        System.out.println("Second largest number is:" + secondLargest);
	    }

	
	}


