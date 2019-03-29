package com.class10;

import java.util.Scanner;

public class TestingForHomework {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int[] array = new int[5];
		
		System.out.println("Input");
		for (int i=0; i<array.length; i++) {
		  
		   if (i==0) {
		   array[0]=scan.nextInt(); 
		   } else if (i==1) {
		     array[1]=scan.nextInt(); 
		   } else if (i==2) {
		     array[2]=scan.nextInt();
		   } else if (i==3) {
		     array[3]=scan.nextInt();
		   } else if (i==4) {
		     array[4]=scan.nextInt();
		   } else if (i==5) {
		     array[5]=scan.nextInt();
		   } }
		   
		   System.out.println("Output");
		   
		   for (int i=0; i<array.length; i*=10) {
		     System.out.print(array[i]);
		   } 
		   System.out.println();

	}

}
