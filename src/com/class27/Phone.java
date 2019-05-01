package com.class27;

public abstract class Phone { //abstract class

	public void makeCall() {
		System.out.println("Phone can make a call");
	}
	public void sendText() {
		System.out.println("Phone can send text");
	}
	public abstract void unlockPhone(); //if use abstract method class should be abstract too

    public abstract void viewPictures();

}

class IPhone extends Phone { //child class - concrete class - is a class that inherited 
	            // from abstract class or implemented by Interface and 
	            // and providing complete implementation of all unimplemented/abstract methods

	@Override
	public void unlockPhone() {
		System.out.println("To unlock iPhone use FaceID or TouchID");	
	}
	@Override
	public void viewPictures() {
		System.out.println("To view images on iPhone go to Images");
}}

class Samsung extends Phone {//when you create a child of abstract class you must provide behavior

	@Override
	public void unlockPhone() {
		System.out.println("To unlock Samsung use password");
		}
    @Override
	public void viewPictures() {
    	System.out.println("To view images on Samsung go to Gallery");
		
	}}
