package com.class11;

public class RetrievingAllValues {

	public static void main(String[] args) {

		
		int [][] num = {
				       {11,12,13,14},
				       {21,22,23},
				       {31,32,33,34}
				       };
		
		int rows = num.length;    //to find number of columns we will go inside the row 
		System.out.println(rows);
		
		int columns = num[0].length; //we go inside row 0 and find
		System.out.println(columns);
		
		int column = num[1].length;
		System.out.println(column); // we go inside row 1 
		
// to print all values we use NESTED LOOPs
		
	for (int row=0; row<num.length; row++) { // we loop row  
			
		for (int col=0; col<num[row].length; col++) { //we loop columns (col) row is changing thats why we correlate the size with row
		System.out.print(num[row][col]+" ");   // number of rows is 4 - we loop 4 times -> then jump into Outer Loop
			} 
		System.out.println();
		} 

	
String[][] food = {  // 3 rows, 4 colums max
		          {"burger","fries","hot dog","meatloaf"}, 
		          {"dimsum","fried rice","stir fry"},
		          {"biriyani","korma","naan","chick peas"},
		          };

 for (int i=0; i<food.length; i++) { // i is a row, we loop rows first
	  
	 for (int g=0; g<food[i].length; g++) { //access main array and then the array we need - 1 row
		 System.out.print(food[i][g]+" ");
	 } System.out.println(); //creates new line
 }  

}}
