package com.class9.demo;

public class InClassTaskThree {

	public static void main(String[] args) {
		
	InClassTaskThree obj = new InClassTaskThree();
	obj.printPattern();
		
	 

	}
	void printPattern() {
		for (int a=1; a<=5; a++) {
			for (int b=1; b<=a; b++) {
				System.out.print(b);
			} System.out.println();
		} 
		
	}

}
