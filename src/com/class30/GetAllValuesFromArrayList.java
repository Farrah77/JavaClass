package com.class30;

import java.util.ArrayList;
import java.util.Iterator;

public class GetAllValuesFromArrayList {

	public static void main(String[] args) {
		
		ArrayList <String> names = new ArrayList <String>();
		names.add("Eva");
		names.add("Perla");
		names.add("John");
		names.add("Joshua");
		names.add("Cedrick");
		
		//1 way for loop
		System.out.println("--------For Loop-------");
		for (int i = 0; i<names.size(); i++) {
			System.out.println(names.get(i));
		}
		
		//2 way using advanced for loop
		System.out.println("-------Advanced For Loop-------");
        for (Object name: names) {
        	System.out.println(name);
        }
        
        //3 way using ITERATOR 
        System.out.println("-------Using ITERATOR----------");
        Iterator<String> it = names.iterator();
        //boolean check = it.hasNext();
        
        while (it.hasNext()) {
        	System.out.println(it.next());
        }
        
	}

}
