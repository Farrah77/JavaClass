package com.class10;

public class ArrayCreation {

	public static void main(String[] args) {
		
                    //0, 1, 2, 3
		int[] array= {10,20,30,40}; //declare, initialize at one line 
		
		System.out.println(array[2]);
		
		System.out.println(array.length); //to find the size of the array
		
		//create a string of names, store 5 names
		                // 0,    1,      2,     3,    4
		String[] names= {"John", "Mike","Jenn","Liz","Nick"};   //names is an array
		
		System.out.println("There are "+names.length +" values in my array of names");
		System.out.println(names[2]);
		
		
	}

	
	
}
