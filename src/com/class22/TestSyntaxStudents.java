package com.class22;

public class TestSyntaxStudents {

	public static void main(String[] args) {
		
		//SyntaxStudents student1 = new SyntaxStudents();
		//student1.studentName="Farrah";
		//student1.studentLastName="Mamadieva";
		
		//student1.getStudentDetails();
		
//if we have more students, instead of typing more codes we create a parameterized constructor
		
	SyntaxStudents student1 = new SyntaxStudents("Aisha","Noman"); 
	student1.getStudentDetails();
	
	SyntaxStudents student2 = new SyntaxStudents("Mustafa","Ozturk"); 
	student2.getStudentDetails();
	}

}
