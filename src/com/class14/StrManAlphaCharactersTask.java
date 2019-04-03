package com.class14;

public class StrManAlphaCharactersTask {

	public static void main(String[] args) {
/*Create a String that should be combination of letters, numbers and special characters. 
 * Find out how many alpha characters are there in the String.
 */

		String str = "Today is 2019th year from BC. 777%#$^";
		String newString = str.replaceAll("[^A-Za-z]", "");
		System.out.println(newString.length());
		


	}

}
