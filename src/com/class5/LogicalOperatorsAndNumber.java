package com.class5;

public class LogicalOperatorsAndNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* if number is between 1-10 -> small
 * if number is between 10-100 -> medium
 * if number is between 100-1000 -> large
 */
	
		int num=15;
		 if (num>=1 && num<=10) {
			 System.out.println("The number is small");
		 } else if (num>=11 && num<=100) {
			 System.out.println("The number is medium");
		 } else if (num>=101 && num<=1000) {
			 System.out.println("The number is large");
		 } else {
			 System.out.println("Number is out of range");
		 }
	
	}

}
 