package com.class11;

public class NestedLoopTwoDTask3 {

	public static void main(String[] args) {
/* Create an array of countries: north america countries, south america countries, 
 * europe countries, asian countries, african countries. Then print all values from 
 * that array.
 */
	
		String[][] country = {
				             { "Canada", "Mexico", "USA", "Cuba"},
				             { "Columbia", "Ecuador", "Guiana", "Urugvay"},
				             {"Italy", "France", "UK", "Sweden", "Portugal"},
				             {"China", "Burma", "India", "Laos","Indoneasia"},
				             {"Ghana", "Egypt", "Senegal", "Angola", "Namibia"}
		                     };
		
		for (int row=0; row<country.length; row++) {
			
			for (int col=0; col<country[row].length; col++) {
				
				System.out.print(country[row][col]+" ");
			} System.out.println();
		}

}} 
