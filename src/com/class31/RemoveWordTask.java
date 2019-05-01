package com.class31;

import java.util.ArrayList;
import java.util.Iterator;

/* Create an arrayList of words. Remove every 
 * word that ends with “e”.
 */

public class RemoveWordTask {

	public static void main(String[] args) {
	
		ArrayList<String> list = new ArrayList<String>();
		list.add("Avoska");
		list.add("Neboska");
		list.add("Pirate");
		
		Iterator<String> iterator=list.iterator();
		while(iterator.hasNext()) {
			String word=iterator.next();
			if(word.endsWith("e")) {
				iterator.remove();
			}
		}
		System.out.println(list);
		

	}

}
