package com.class24;

public class ParentTest {

	public static void main(String[] args) {
		
		String a;
		a="parent";
		
		Parent parent = new Parent();
		parent.love();
		parent.work();
		
		Child child = new Child();
		child.love();
		child.cry();
		child.work();
		
		//type casting 
		//when we talk about non primitive data: we зut smaller thing into bigger box
		
Parent obj = new Child();//Child is smaller than Parent super class/ Child class is given reference of Parent class
		
//Child obj1 = new Parent(); //Parent is bigger (superior than Child class, so we can't put inside 
		
obj.work(); //here Parent is taking the reference, so all method available in Parent class for Child Class
obj.love(); //any overriden method we can take from Child class
// obj.cry(); - not accessible Child is smaller than Parent 
	}

}
