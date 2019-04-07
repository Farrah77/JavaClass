package com.class18;

public class Human {
	
	static String eyeColor="Brown"; //when we create a object, properties will be copied to another object
	                                //when we change variable to static - it 
	int height=6;
	int weight=180;
	String gender="F";
	
	String programmingLanguage = "Java"; //we can use this variable anywhere - instane variable - class variable
	
	void speak() {
		
		String language = "English"; //this is local variable (inside method)
		
		System.out.println("Humans can speak"+language); // we can't use outside the method - compiler error
	}
    void coding() {
    	System.out.println("Humans can code");
    }
    
    public static void main(String[] args) {
    	
    	Human person = new Human();
    	System.out.println(person.eyeColor); 
		System.out.println(person.height);   
		System.out.println(person.weight);
		System.out.println(person.gender);
    }
    
}
