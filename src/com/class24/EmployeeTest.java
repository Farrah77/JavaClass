package com.class24;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee emp = new Employee();
		FullTimeEmployee ft = new FullTimeEmployee();
		ContractorEmployee contractor = new ContractorEmployee();
		
		emp.getPaid(); //object for parent class
		ft.getPaid(); //overriding parent method - no one get affected, it s specific for this method only
		contractor.getPaid(); //same message as in Parent 
		
}

}
