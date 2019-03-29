package com.class12;

public class ForEachLoop2D {

	public static void main(String[] args) {
	/* Create a grocery list: fruits
	 *                        veggies
	 *                        dairy 
	 * Retrieve values using 2 different loops
	 */
		
	String [][]	list = { 
			           { "Pineapple", "Apples", "Mango", "Papaya"},
			           { "Bok Choy", "Carrots", "Cucumbers", "Tomatoes"},
			           { "Youghurt", "Milk", "Cottage Cheese", "Butter"}
			           };
	
	System.out.println("--------For Loop---------");
	for (int i=0; i<list.length; i++) {
		for (int j=0; j<list[i].length; j++) {
			System.out.print(list[i][j]+" ");
		} System.out.println();
	}
	
	System.out.println("---------For Each Loop----------");
		
	for (String[] grocery:list) {
		for (String items:grocery) {
			System.out.print(items+" ");
		} System.out.println();
	}
		
		
		
		
		
	}

}
