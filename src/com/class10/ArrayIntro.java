package com.class10;

public class ArrayIntro {

	public static void main(String[] args) {
		
		int num;
		
		num=10; //int num=10; - other way 
		
		
		int[] array1; //declare an array - the most preferable way (you immediately see the brackets
		int [] array2; // declare an array
		int array3[]; //other way to declare an array - pay attention to spacing!
	
	//we declared - > now initialize an array - we have to specify what is the size of our array
		// when we create object we use new
	//!!!!! at the time of declaration we can not specify the size. only in assigning (initialize)
		
		array1=new int[4]; //we initialize an array ->  said it holds 4 values (size is 4)
		                   // 0,1,2,3 - 4 values, all integers- same type. 
		array1[0]=10;
		array1[1]=20;      //lines 22-25 assigning value
		array1[2]=30;
		array1[3]=40;
		
	//then access values - i want to see the value of the element inside array1 with index 2
		
		System.out.println(array1[2]);
		
		// how to declare and assign in 1 step , above - 2 steps(lines 7-14)
		
		int[] numbers=new int[3]; //inside index it will be the same number as number of values you want to hold
		numbers[0]=10;   //this lines we assign the values
		numbers[1]=20;
		numbers[2]=30; 
	// numbers[3] = 40; compiler won't notice it, but we gonna have runtime error - ArrayIndexOutOfBoundException
	//in case if try to add extra value assignment	
		
		System.out.println(numbers[2]);
	// we can do mathematical operations syso(numbers[1]+numbers[2]) - it will print sum 
	// same we can divide, minus or multiply.
		
		String[] a=new String[3];
		a[0]="Hello";
		a[1]="Hi";
		a[2]="Bye";
		
		System.out.println(a[1] + " friends");
	}

}
