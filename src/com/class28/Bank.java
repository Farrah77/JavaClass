package com.class28;

public interface Bank {
	
	String name = "Bank"; //by default all variables are public static and final
	String hello="hi";
	
	//by default compiler adds public and abstract to every method
	void hasChecking(); 
	void hasSavings();
	void hasCreditCard();
	//in the interface we have only undefined methods

}



class BOA implements Bank {

	@Override
	public void hasChecking() {
		System.out.println("BoA has 2 checking accounts");
		
	}

	@Override
	public void hasSavings() {
		System.out.println("BoA has 2 saving accounts");
		
	}

	@Override
	public void hasCreditCard() {
		System.out.println("BoA has 10 different credit cards");
		
	}
}
class PNC implements Bank {

	@Override
	public void hasChecking() {
		System.out.println("PNC has 3 checking accounts");
		
	}

	@Override
	public void hasSavings() {
		System.out.println("PNC has 3 saving accounts");
		
	}

	@Override
	public void hasCreditCard() {
		System.out.println("PNC has 7 different credit cards");
		
	}
	
}
