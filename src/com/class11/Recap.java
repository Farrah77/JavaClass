
package com.class11;

public class Recap {
	
public static void main(String[] args) {
	
	//create an array of names holding 5 elements and retrieve all values
	//this method called array literal
	
	String[] names = {"Asel", "Awet", "Weqas", "Arif", "Dzmitri"};
	
	System.out.println("-----------For Loop------------");
	for (int i=0; i<names.length; i++) { //names.length - we are using property of the array
		System.out.println(names[i]);
	}
	
	//retrieve values using: advanced for loop; OR for each loop OR enhanced loop
	
	System.out.println("---------Advanced For Loop------------");
	for (String student:names) {
		System.out.println(student); //what is does is takes the first value inside the loop
		                             // and assigns it to the variable - student and then prints it
		                             // it will do so until all values are printed
	                                // we don't use any index, it simply retrieves all elements and stops 
	
	}        
}
}