package com.class22;

public class ChildOne extends Parents {
	
	String hairType="curly"; //specific to Child One
	
	public static void main(String[] args) {
		
		ChildOne childObj =new ChildOne();
		System.out.println("Child 1 has eye color "+childObj.eyeColor);
		System.out.println("Child 1 has hair color "+childObj.hairColor);
		System.out.println("Child 1 has "+childObj.nose+" nose");
		childObj.sing();
		
		
		Parents parentObj = new Parents();
		//parentObj.hairTypeis not accessible as it is belong to child
		//parentObj.playTennis is not accessible - belongs to child
	}
    
	public void playTennis() { //belongs to Child One 
	System.out.println("Child 1 can play tennis");
}
}
