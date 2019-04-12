package com.class20;

public class Employee {
	
/* Create a Class called Employee:
Create three  variables  eID , salary and set the CEO to “Sumair”
Create two objects of the class Employee
Set the value of eID, salary for each of the objects
Print out the eID , salary and  CEO for each of the objects
*/
	
	
	
	static String ceo="Sumair";
	
	int eID;
	double salary;
	
	public static void main(String[] args) {
		
		Employee person1 = new Employee();
		Employee person2 = new Employee();
		
		person1.eID=12345;
		person1.salary=120.000;
		
		
		person2.eID=23456;
		person2.salary=115.000;
		
		person1.printEmployee();
		person2.printEmployee();
		
	}
 void printEmployee() {
	 
System.out.println("Employee id is "+eID+"with salary "+salary+" and his CEO is "+ceo);

 }
}
	
	
	


