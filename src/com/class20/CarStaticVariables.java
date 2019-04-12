package com.class20;

public class CarStaticVariables {
	
	public String color;  //null value as on object
	public static int totalCars; //0 by default  (boolean=false)

	public static void main(String[] args) {
		

		CarStaticVariables car1 = new CarStaticVariables();
		car1.color="white";
		totalCars++; //incrementing by one  0+1 = 1
		
		CarStaticVariables car2 = new CarStaticVariables();
		car2.color="black";
		totalCars++; //1+1 = 2
		
		System.out.println("Total cars we made are "+totalCars);
		
		//if we remove static - variable become instance and we have to access with object 
		//public int totalCars  -> car1.totalCars  car2.totalCars
		
	}

}
