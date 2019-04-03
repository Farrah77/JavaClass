package com.class15;

public class Computer {
	
	Boolean mouse, keyboard; 
	String os, brand; 
	int screen, ram;

	public static void main(String[] args) {
		
	
		Computer comp1 = new Computer();
		System.out.println("--------First Computer---------");
		comp1.mouse=true;
		comp1.keyboard=true;
		comp1.screen = 2;
		comp1.ram=8;
		comp1.brand="HP";
		comp1.os="Windows";
		//define behavior 
		comp1.watchMovie();
		comp1.playMusic();
		comp1.doJavaCoding();
		
		
		Computer comp2 = new Computer();
		System.out.println("--------Second Computer");
		comp2.mouse = false;
		comp2.keyboard=false;
		comp2.screen=4;
		comp2.ram=6;
		comp2.brand="Apple";
		comp2.os="Mac OS";
		
		comp2.watchMovie();
		comp2.playMusic();
		comp2.doJavaCoding();
	}
	
	void watchMovie() {
		System.out.println("You can watch movies on a "+ brand+" computer");
	}
	void playMusic() {
		System.out.println("You can play music on a "+brand+" computer");
	}
	void doJavaCoding() {
		System.out.println("You can do Java Coding on a "+brand+" computer");
	}
}
