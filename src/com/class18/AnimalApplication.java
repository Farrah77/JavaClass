package com.class18;

public class AnimalApplication {

	public static void main(String[] args) {
		
		Animal animal1 = new Animal(); //animal is instance/variable - we create instance of Animal class
		                               //we put instance into local variable 
		
		System.out.println("-----Animal 1--------");
		System.out.println("The animal is "+animal1.breed);
		System.out.println("The animal's name is "+animal1.name);
		System.out.println(animal1.weigth);
		System.out.println(animal1.age);
		System.out.println(animal1.canRoar());
		System.out.println(animal1.isWild());
		
        Animal animal2 = new Animal();

        animal2.breed = "Jaguar";
        animal2.age=4;
        animal2.weigth=300;
		
        System.out.println("--------Animal 2--------");
		System.out.println("The animal is "+animal2.breed);
		System.out.println("The animal's name is "+animal2.name);
		System.out.println(animal2.weigth);
		System.out.println(animal2.age);
		System.out.println(animal2.canRoar());
		System.out.println(animal2.isWild());
		
        Animal animal3 = new Animal();
        animal3.breed = "Leopard";
		animal3.age = 1;
		animal3.weigth=250;
		System.out.println("---------Animal 3---------");
		System.out.println("The animal is "+animal3.breed);
		System.out.println("The animal's name is "+animal3.name);
		System.out.println(animal3.weigth);
		System.out.println(animal3.age);
		System.out.println(animal3.canRoar());
		System.out.println(animal3.isWild());
		
		//for Minimum Class Task
		
		
		
		int[] array = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };
        System.out.println("------Printing the minimum and maximum values-----");       		
        		 
        System.out.println(Minimum.minOfValues(array));
        System.out.println(Minimum.maxOfValues(array));
        
        int my_array[] = {-1,2,3,4,5,6,7,8,9,10};
		
	}
	

}
