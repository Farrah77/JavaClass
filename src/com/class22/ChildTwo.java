package com.class22;

public class ChildTwo extends Parents {
	
	String hairType="straight";
	
	
	public static void main(String[] args) {
		
		ChildTwo childObj2 =new ChildTwo();
		System.out.println("Child 2 has eye color "+childObj2.eyeColor);
		System.out.println("Child 2 has hair color "+childObj2.hairColor);
		System.out.println("Child 2 has "+childObj2.nose+" nose");
		childObj2.sing();
		childObj2.swim();
	}
	
	public void swim() {
		System.out.println("Child 2 can swim well");}
	

}
