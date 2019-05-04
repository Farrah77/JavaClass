package com.class33;

import java.util.HashMap;
import java.util.Map;

public class MapBuilding {

	public static void main(String[] args) {
		
	Map<Integer, String> map = new HashMap<>();
	
	map.put(1, "Google");
	map.put(2,"Facebook");
	map.put(3, "Instagram");
	map.put(4, "Linkedin"); 
	map.put(5, "Linkedin");
	map.put(6, "Amazon");
	map.put(7, "Amazon");
	
	
	System.out.println("-----Total number of floors-----");
	System.out.println(map.size());
	
	System.out.println("----Updated 4th floor-----");
	map.replace(4, "Pinterest");
	System.out.println(map.get(4));
	
	System.out.println("-------7th moved , new total #-----");
	map.remove(7);
	System.out.println(map.size());
	
	System.out.println("----All companies----");
	System.out.println(map);
	
	}

}
