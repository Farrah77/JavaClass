package com.class11;

import java.util.Scanner;

public class LoopsTasks {

	public static void main(String[] args) {
	/* 1. Create an array of cars and store 6 elements into it. Using 2 different loops print all values from the array.
.
. */ 
		
		
		String[] cars = {"Ford", "Mercedes", "Mustang", "Corvett", "Audi", "Suzuki"}; 
		
		for (int i=0; i<cars.length; i++) {
			System.out.print(cars[i]+" ");
		}
		
		String[] carS = {"Ford", "Mercedes", "Mustang", "Corvett", "Audi", "Suzuki"}; 
		for (String auto: carS) {
			System.out.print(auto+" ");
		}
		
		

	
		
		}
	}


