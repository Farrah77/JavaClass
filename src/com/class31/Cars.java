package com.class31;

import java.util.ArrayList;
import java.util.Iterator;

/*Create an arraylist of cars and retrieve all the values using 4 
 * different ways.
 */

public class Cars {

	public static void main(String[] args) {
		
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Toyota");
		cars.add("Mercedes"); 
		cars.add("BMW");
		
		System.out.println("----------using for loop----------");
		for (int i=0; i<cars.size(); i++) {
			System.out.println(cars.get(i));
		}
		System.out.println("----------using for each loop----------");
		for (Object car: cars) {
			System.out.println(car);
		}
		
		System.out.println("----------using iterator----------");
		Iterator<String> it=cars.iterator();
		
		while(it.hasNext()) {
			
			System.out.println(it.next());
		}
		System.out.println("----------using while loop----------");
		int c=0;
		
		while(cars.size()>c) {
			String myCar=cars.get(c);
			System.out.println(myCar);
			c++;
		}
		
		
		
	}
}


