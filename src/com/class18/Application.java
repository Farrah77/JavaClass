package com.class18;

public class Application {

	public static void main(String[] args) {
	
		Human person1 = new Human(); //we can create object here because in class Human is public
		                      // all properties for all object because it is 
		
		
		//person1.eyeColor = "Pink"; // AFTER COPYING we can do changes eyecolor is pink now
		
		System.out.println(person1.eyeColor); // initially we just get copy -
		System.out.println(person1.height);   // we copied all properties from Human class
		System.out.println(person1.weight);
		System.out.println(person1.gender);
		
		
		
		Human person2 = new Human();
		
		
		
		System.out.println(person2.eyeColor); //when variable is static value becomes the same for all object
		System.out.println(person2.height);   
		System.out.println(person2.weight);
		System.out.println(person2.gender);
	}

}
