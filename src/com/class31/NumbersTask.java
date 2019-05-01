package com.class31;

import java.util.ArrayList;
import java.util.Iterator;

/*Create an arrayList of even numbers from 1 to 50. 
 * Using Integer remove any number that is divisible 
 * by 5 from that arrayList.
 */

    public class NumbersTask {
    	
    	public static void main(String[] args) {
    	
    	ArrayList <Integer> numbers= new ArrayList<Integer>();

    		for (int i=1; i<=50; i++) {
    			if(i%2==0)
    			numbers.add(i);
    			
    		}
    		Iterator<Integer> iterator=numbers.iterator();
    		while(iterator.hasNext()) {
    			int number=iterator.next();
    			if(number%5==0) {
    				iterator.remove();
    			}
    		}
    		System.out.println(numbers);
		}
	
	
}
