package com.reviewclass;

import java.util.ArrayList;
import java.util.Iterator;

public class ListTest{
  
  public static void main(String[] args) {
    
    List student1=new List("Shiva");
	List student2=new List("Sandish");
    List student3=new List("Asel");
		
  ArrayList<List> names = new ArrayList<List>();
  names.add(student1);
  names.add(student2);
  names.add(student3);
  
  for (int i=0; i<names.size(); i++) {
   List y=(List)names.get(i);
    
  }
	System.out.println(names);
}
}
