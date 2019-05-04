package com.class33;

import java.util.*;

/* Create a map of Best Buy store. Place
item id and item name into it. 
Example (7664847 = Printer, 7879885= TV etc )
Print all keys and values from a Best Buy map using EntrySet.
 * 
 */

public class BestBuyEntrySet {

	public static void main(String[] args) {
	
		Map<Integer, String> bb = new LinkedHashMap<>();
		bb.put(12345, "iPhone");
		bb.put(12367, "MacBookPro");
		bb.put(12389, "MacBookAir");
		
		System.out.println(bb);
		
		for (Map.Entry<Integer, String> entry:bb.entrySet()) {
			System.out.println(entry.getKey()+"="+entry.getValue());
		}
		System.out.println("/////////////");
		Iterator<Map.Entry<Integer,String>> bbIterator = bb.entrySet().iterator();
		while(bbIterator.hasNext()) {
			Map.Entry<Integer, String> me = bbIterator.next();
			System.out.println(me.getKey()+"="+me.getValue());
		}
		
	}

}
