package com.class27;

public class PhoneTest {

	public static void main(String[] args) {
		
//Phone obj = new Phone(); //we CAN'T instantiate Phone class because it is abstract 		
	
		Phone obj = new IPhone(); //we instantiate child class
		obj.makeCall();
		obj.sendText();
		obj.unlockPhone();
		obj.viewPictures();
		
		Phone obj2 = new Samsung();
		obj2.makeCall();
		obj2.sendText();
		obj2.unlockPhone();
		obj2.viewPictures();

	}

}
