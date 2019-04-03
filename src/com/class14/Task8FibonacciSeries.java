package com.class14;

public class Task8FibonacciSeries {

	public static void main(String[] args) {
		// Print first 10 number of Fibonacci series 

// 0+1=1 -> 1+1 = 2 -> 2+1=3 ->...
		
		int a=0;
		int b=1;
		int c=0;
		
		for (int i=0; i<10; i++) {
			c=a+b;
			a=b;
			b=c;
			System.out.print(a+" ");
		}
	}

}
