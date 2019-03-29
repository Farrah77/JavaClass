package com.class11;

public class ForLoopInterviewQuestionTheLargestNumber {

	public static void main(String[] args) {
		// create an array of integers and find the largest number
		
		int[] numbers = {20, 30,10,40,50};
		int largestNumber = numbers[0]; //we assume the largest is equal to the first value
		int minimumNumber = numbers[0]; 
		for (int num: numbers) {
			
			if (num>largestNumber) {   //we compare 20 with each value, and when the condition is true, it executes
				largestNumber=num; 
		
			} else if (num<minimumNumber) {
				minimumNumber=num; 
			}
				
		} System.out.println("The largest number is "+largestNumber);
          System.out.println("The minimum numbers is "+ minimumNumber);
		
		/* for (int i=0; i<numbers.length; i++) {
		 *  if (numbers[i]>largest) {
		 *  largest=numbers[i];
		 */
	}

}
