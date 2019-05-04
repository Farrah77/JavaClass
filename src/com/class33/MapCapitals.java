package com.class33;

import java.util.*;

/*
 * Create a map of countries with its capital. 
Print all keys and values from a country map using 
for each loop and iterator.
Print all values from a country map using for each loop 
and iterator.
 */
public class MapCapitals {

	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<>();
		map.put( "France" , "Paris");
		map.put("Italy" , "Rome");
		map.put("Germany" ," Berlin");
		map.put("Belgium", "Brussels");
		
		Set<String> keys = map.keySet();
		System.out.println("----for loop----");
		for (String key: keys) {
			System.out.println(key+": "+map.get(key));
		}
		
		System.out.println("-----iterator------");
		Iterator <String> keysIt = keys.iterator();
		while(keysIt.hasNext()) {
			String key=keysIt.next();
			System.out.println(key+":"+map.get(key));
		}

		System.out.println("-------Values/Capitals-------");
		Collection <String > valCol=map.values();
		System.out.println("-------Using for each loop------");
		for (String value: valCol) {
			System.out.print(value+", ");
			
	}
		System.out.println("-----All countries----");
		Collection <String > country=map.values();
		System.out.println("----Countries - For Loop ------");
		for (String coun: country) {
			System.out.print(coun+", ");
}
	}}

