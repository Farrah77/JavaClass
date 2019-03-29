package com.class11;

public class ForLoopsTask3 {

	public static void main(String[] args) {
		// 3. Create an array on integers and calculate the sum of 
		// all elements in an array

		
		int[] numbers= {10,20,30,40,50} ;
		int sum=0;
		System.out.println("------For Loop-------");
		
       for (int i=0; i<numbers.length; i++) {
    	   sum=sum+numbers[i];
    	   
		} System.out.println(sum);
	} 

}
