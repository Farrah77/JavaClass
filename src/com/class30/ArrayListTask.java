package com.class30;

import java.util.ArrayList;

/* Create a generic ArrayList that will store 5 names into it.
Find out whether the given ArrayList is empty or not?
Check whether the specific name is present in an ArrayList or not?
Find the size of your arrayList and print all values from that
*/

public class ArrayListTask {

	public static void main(String[] args) {
		
		//generic array that stores only String object
		ArrayList <String> names = new ArrayList <String>();
		names.add("Eva");
		names.add("Perla");
		names.add("John");
		names.add("Joshua");
		names.add("Cedrick");
		
		System.out.println(names.isEmpty());
		System.out.println(names.contains("Eva"));
		System.out.println(names.size());
		
		System.out.println("------All Values------");
		for (int i=0; i<names.size(); i++) {
			System.out.println(names.get(i));
		}

	}

}
