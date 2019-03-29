package com.class11;

public class NestedLoopTwoDArrayTaskOne {

	public static void main(String[] args) {
		// Create an array of cars : american, german, korean, italian. 
		// Then retrieve all values from that array
		
		String[][] cars = {
				          {"Ford", "Chevrole","Lincoln"},
				          {"Mercedes", "Audi", "Wolgskwagen", "Porshe"},
				          {"Hyundai", "Kia", "Daewoo"},
				          {"Fiat", "Lamborghini", "Mazeratti"}
		                  }; 

		for (int row=0; row<cars.length; row++) {
			
			for (int col=0; col<cars[row].length; col++) {
				
				System.out.print(cars[row][col]+" ");
			} System.out.println();
		}
	}

}
