package com.class30;

import java.util.ArrayList;

public class ArrayListTypes {

	public static void main(String[] args) {
		
//we didn't specify the type Object and we can store any type of Object
//we call it non-generic array list 
//it looks like a primitive data type but it is not - it is Object
		
	ArrayList alist = new ArrayList();
	alist.add("String"); //String - Object not data type
	alist.add(100);      //Integer
	alist.add(100.10);   //Double
	alist.add(true);     //Boolean
	alist.add('s');      //Character
	
	//reaching all values - for loop
	
	for (Object values: alist) {
		System.out.println(values);
	}
	}

	//generic array list 
	//ArrayList <Boolean> booleanArrayList = new ArrayList <Boolean>();
	
	//booleanArrayList.add(true);
	//booleanArrayList.add(false);
	
	//for (Object val:booleanArrayList) {
	//	System.out.println(val);}
	
}
	
	
