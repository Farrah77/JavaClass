package com.reviewclass;

public class ReviewClassTwoDArrays {

	public static void main(String[] args) {
		// Write a program to print all elements of 2D array using ForLoop
		
		int [][] arr= {
				{1,2,3},
				{4,5,6,9},
				{7,6}
		               };
		System.out.println("-------For Each Loop---------");
		for (int[] array : arr) {
			for ( int element : array) {
				System.out.print(element);
			}System.out.println();
		} 
System.out.println("---------For Loop---------");
for (int i = 0; i < arr.length; ++i) {
    for (int j = 0; j < arr[i].length; ++j) {
        System.out.println(arr[i][j]);
    }
}
	}

}
