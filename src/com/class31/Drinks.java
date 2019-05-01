package com.class31;
/* 
 * Create an arrayList of drinks. If any drink has letter “a” or “e” 
 * replace it with water.
 */

import java.util.ArrayList;
import java.util.Iterator;

public class Drinks {

	public static void main(String[] args) {
		
	ArrayList<String> drinks=new ArrayList<String>();
	drinks.add("Wine");
	drinks.add("Soda");
	drinks.add("Juice");
	drinks.add("Milk");
	drinks.add("Kumys"); 
	
	for (int i=0; i<drinks.size(); i++) {
	
	    String drink= drinks.get(i);
		if (drink.contains("e") || drink.contains("a")) {
		drinks.set(i, "Water"); 
		}
	}
	System.out.println(drinks);
	}
	

	}


