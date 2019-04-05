package com.class17;

public class Greetings1 {

	public static void main(String[] args) {
		// create a methid that will ask How are you, name? 
		
	Greetings1 obj = new Greetings1(); //object
	obj.askHowAreYou("Farrah"); //call the object 
	
}  void askHowAreYou(String name) {          // we can have hundreds of codes but not all of them will be executed
	System.out.println("How are you "+name); //it will find the matching one and execute it. 
}
   void askHowAreYou1(String name) {
	System.out.println("How are you "+name); //dynamic code -> because we change the name 
}  void askHowAreYou2(String name) {
	System.out.println("How are you "+name);
}
}
