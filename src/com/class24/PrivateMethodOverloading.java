package com.class24;

public class PrivateMethodOverloading {
	
	private void getInfo() {
		System.out.println("I am private method with no parameters");
		
	}
	private void getInfo(String str) {
		System.out.println("I am private method with String type parameter "+str);
	}
	private void getInfo(int a) {
		System.out.println("I am private method with integer type parameter "+a);
	}
	
	public static void main(String[] args) {
		
		PrivateMethodOverloading obj = new PrivateMethodOverloading();
		obj.getInfo();
		obj.getInfo("Summer");
		obj.getInfo(7);
		
		
	}

}
