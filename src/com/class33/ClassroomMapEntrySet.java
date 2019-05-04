package com.class33;

import java.util.*;

public class ClassroomMapEntrySet {

	public static void main(String[] args) {
	
		
	Map <String, Integer> classroomMap = new LinkedHashMap<>();
	classroomMap.put("Table", 20); //Entry<Key, Value>
	classroomMap.put("Chair", 40); //Entry <String, Integer>
	classroomMap.put("Student", 60);
	classroomMap.put("Instructor", 3);
	classroomMap.put("Screen", 3);
	
	System.out.println(classroomMap); //all values
	
for (Map.Entry<String, Integer> entry : classroomMap.entrySet()) {
	System.out.println(entry.getKey()+":"+entry.getValue());
}

System.out.println("/////////////////////////////////");

Iterator<Map.Entry<String, Integer>> classroomMapIterator = classroomMap.entrySet().iterator();
	while (classroomMapIterator.hasNext()) {
		Map.Entry<String, Integer> me = classroomMapIterator.next();
		System.out.println(me.getKey()+":"+me.getValue());
}


	}

}
