package com.class11;

public class ForEachLoop {

	public static void main(String[] args) {
		// this for each loop helps to retrieve values faster 
		// without calculating size and index

		int [] numbers = {12,13,14,15,16,17};
		
		for(int monkey:numbers) {
			System.out.print(monkey+" ");
		}
	}

}
