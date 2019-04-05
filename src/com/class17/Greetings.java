package com.class17;

public class Greetings {

	public static void main(String[] args) {
		// Methods 
	Greetings obj=new Greetings();
	obj.hello();     // accessing the method 
	obj.findLargest(20,10);
	obj.findLargest(30,32); //you can print whatever numbers you want to compare
	obj.helloToInstructor("Awet");
	obj.helloToInstructor("Asel");
	
	//how to find largest number

		
	}
	void hello() { //method signature //empty brackets - no parameters
		System.out.println("Hello"); //method body 
	}
    void findLargest(int a, int b) { // parameters //method with parameters
    	if(a>b) {
    		System.out.println("A is larger than B");
    	} else {
    		System.out.println("B is larger than A");
    	}
    }
    void helloToInstructor(String name) {
    	System.out.println("Hello "+name);
    }
}
