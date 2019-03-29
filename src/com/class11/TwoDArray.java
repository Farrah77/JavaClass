package com.class11;

public class TwoDArray {

	public static void main(String[] args) {
	 
	/* INDEXes 	    0	1	2	3
               0	12	13	14	15
               1	1	2	3	4
               2	5	10	15	20
               3	100	200	300	400 */ 

		
		int [][] d = new int [4][4]; //4 rows; 4 columns; 4*4=16 elements in total
		
		//1 row:
		
		d[0][0] = 12;
		d[0][1] = 13;
		d[0][2] = 14;
		d[0][3] = 15;
		
		//2 row 
		d[1][0] = 1;
		d[1][1] = 2;
		d[1][2] = 3;
		d[1][3] = 4;
		
		//3 row
		d[2][0] = 12;
		d[2][1] = 13;
		d[2][2] = 14;
		d[2][3] = 15;
		
		System.out.println(d[0][1]);
		
		//using array literal  - 2d array is an array of arrays
		
		int [][] c = {         // we have one big array and inside this array we have several arrays by rows
				{12,13,14,15},
				{1,2,3,4},
				{5,10,15,20},
				{100,200,300,400}
		                        }; 
				
		
	System.out.println(c[3][1]); //200
	System.out.println(c[0][0]); //12
	
	//strings
	
	String [][] groups = { 
			             { "Jawid", "Amina","Mustafa","Emily","Ahmad"},
			             { "Farrah", "Milena", "Lola", "Zaki", "Samir"},
			             { "Muhammad", "Aleksey", "Inna","Anatoly", "Sheyh"}
	                     };
	
	System.out.println(groups[0][1]);
	System.out.println(groups[0][1]+ " "+groups[1][2]);
	
	}}


