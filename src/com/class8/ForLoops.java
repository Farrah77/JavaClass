

package com.class8;

public class ForLoops {
	
	public static void main(String[] args ) {
		
		/* print even numbers between 20 and 50 (2 ways)
		 */
		
		for (int i=20; i<=50; i+=2) {
			System.out.println(i);
	
	} 
		//2 way
		
		for (int i=20; i<=50; i++) {
			if (i%2==0) {
				System.out.println(i);
			}
		}
		
		/* print odd numbers between 20 and 50 (2 ways) */
		
		for (int a=20; a<=50; a++) {
			if (a%2==1) {
				System.out.println(a);
			}
		}
		 //2 way
		 for (int k=50; k>=20; k--) {
			 if (k%2==0) {
				 System.out.println(k);
			 }
		 }
} }