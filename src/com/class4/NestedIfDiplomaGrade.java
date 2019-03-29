package com.class4;

public class NestedIfDiplomaGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* check if the person has diploma and hire him
 * if gpa is 3.5 - hire, otherwise - can not hire him /her
 */
	
	double GPA=3.6;
	double expectedGPA=3.5;
	boolean hasDiploma=true;
	
	if (hasDiploma) {
		System.out.println("Congratulations");
		if (GPA>expectedGPA) {
			System.out.println("You are hired");
		}else 
			System.out.println("We can't hire you");
		
} else 
	System.out.println("Get a degree first");

}
}
