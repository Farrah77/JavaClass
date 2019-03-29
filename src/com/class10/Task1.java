
package com.class10; 
		
		import java.util.Scanner;
		class Main {
		public static void main(String[] args) {
		  
		  Scanner scan=new Scanner(System.in); 
		  
		  String[] array = new String[7]; 
		  
		  String day;
		  day=scan.nextLine();
		  
		  for (int a=0; a<array.length; a++) {
		    
		    if (a==0) {
		      System.out.println("Please enter day 1 of the week");
		      day=scan.nextLine();
		    } else if (a==1) {
		      System.out.println("Please enter day 2 of the week");
		      day=scan.nextLine();
		    }
		  }
		  
	}
	
	
	
}