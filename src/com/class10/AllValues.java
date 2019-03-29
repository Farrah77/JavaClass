package com.class10;

public class AllValues {

	public static void main(String[] args) {
		
		char[] grades= {'A','B','C','D','E','F'};

		for (int i=0; i<grades.length; i++) { //we can use <= it will give error because it goes out of limits 
			
			System.out.println(grades[i]);
		}
		
		
		/* another way to code: 
		
		for (int i=0; i<=grades.length-1; i++) -> we minus 1 - not to go out of the size limits
	} */ 


		char[] letter= {'s','a','y','b','n','c','t','d','a','e','x'}; 
		  
		  for (int a=0; a<letter.length; a+=2) {
		    
		    System.out.print(letter[a]); 
		    } 
	
	} } 
