package com.class9.demo;

public class InClassTaskFour {

	public static void main(String[] args) {
	
   InClassTaskFour obj = new InClassTaskFour();
   
   obj.printPattern();
   
	}
	
	void printPattern() {
		for (int a=1; a<=5; a++) {
			for (int b=1; b<=a; b++) {
				System.out.print("*");
			} System.out.println();
		} 

		for (int x=1; x<=4; x++) {
			for (int y=4; y>=x; y--) {
				
				System.out.print("*");
			} System.out.println();
		} 
		
	}

}
