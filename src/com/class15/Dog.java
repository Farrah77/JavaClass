package com.class15;

public class Dog {
	
	String breed, color;
	int age;
	boolean bark;
	
	public static void main(String[] args) {
		
		System.out.println("-----Breed one-----");
		Dog dog1=new Dog();
		dog1.breed="Husky";
		dog1.color="Black";
		dog1.age=2;
		dog1.bark=true;
		 dog1.play();
		 dog1.nap();
		 dog1.bringStick();
		
		System.out.println("-------Breed two-----");
		Dog dog2=new Dog();
		dog2.breed="Bulldog";
		dog2.color="Browm";
		dog2.age=5;
		dog2.bark=true;
		
		dog2.play();
		dog2.nap();
		dog2.bringStick();
		
		System.out.println("-----Breed three------");
		Dog dog3=new Dog();
		dog3.breed="Labrador";
		dog3.color="Golden";
		dog3.age=3;
		dog3.bark=true;
	
		dog3.play();
		dog3.nap();
		dog3.bringStick();
	}
void play() {
	System.out.println(breed+ " can play");
}
void nap() {
	System.out.println("Your "+breed+" loves to nap");
}
void bringStick() {
	System.out.println("Your "+ breed+ " can bring stick");
}
}
