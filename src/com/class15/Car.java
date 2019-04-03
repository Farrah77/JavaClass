
package com.class15;

public class Car { // we created our class Car

String make, model, color;  // creating objects we have to be sure we are inside the CLASS
int door, wheels; 

//to bring our actions we use our main method

public static void main(String[] args) {
	//Class name variable - new ClassName(); 
	
        Car car1=new Car(); // we create a new object by using NEW
        
        //1 Object
        System.out.println("---------The first object----------");
        car1.make="Honda";   //you assign features according to their data type specified in template
        car1.model="Civic";  //we can identify because this object has its unique features
        car1.color="Silver";
        car1.door=4;
        car1.wheels=4; 
        
        System.out.println("Car "+car1.make+" has "+car1.wheels+" wheels");
        // define behavior 
        car1.drive();  // if we debug when we run drive will search for same method -> it will jump to line 39
		car1.reverse();
		car1.honk(); 
        
        //2 Object
        Car car2 = new Car();
        System.out.println("---------The second object---------");
        car2.make="Tesla";
        car2.model="X";
        car2.color="Blue";
        car2.door=4;
        car2.wheels=4;
        System.out.println("My car is "+car2.color+ " "+car2.make);
        // define behavior
        car2.drive();
        car2.reverse();
        car2.honk();
}
    
        void drive() {            //we created an action/behavior 
    		System.out.println("Car can drive");
    	}
        void reverse() {
    	   System.out.println("Car can reverse");
        }
        void honk() {
    	   System.out.println("Car can honk");
        }
        
        
        



	
}