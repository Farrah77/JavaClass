package com.class22;

public class SyntaxStudents {
	
	public static String schoolName="Syntax";
	public static int batchNumber=4;
	
	public String studentName;
	public String studentLastName;
	
	public SyntaxStudents(String name, String lastName) {
		studentName=name;
		studentLastName=lastName;
	}
	
	public void getStudentDetails() {

	String details = "I am a student at "+schoolName+" from batch "+batchNumber+" and my name "
				+ "is "+studentName+" and my last name is "+studentLastName;
	System.out.println(details);
				
	
	}

	
/* schoolName - all same school - static variable
 * batchNumber - static variable 
 * studentName - instance
 * studentLastName - instance
 * 
 * method getStudentDetails
 */
		

}
