package com.reviewclass;

public class ArrayTask1 {

	public static void main(String[] args) {
		/*  Write a program to sum the values of an array
1, 2, 3, 4, 5, 6, 7, 8, 9, 10 */ 
		
	/* long option
		int[] array = {1,2,3,4,5,6,7,8,9,10};
		int sum= array[0]+array[1]+array[2]+array[3]+array[4]+array[5]+array[6]+array[7]+array[8]+array[9];
		System.out.println(sum);
		
		*/ 
		
		int[] array= {1,2,3,4,5,6,7,8,9,10};
		int sum=0;
		
		for (int a=0; a<=array.length; a++) {
			sum=sum+a; //sum+=array[a]
			}
		System.out.println(sum);
	}

}
