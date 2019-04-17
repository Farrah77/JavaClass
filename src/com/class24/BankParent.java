package com.class24;

public class BankParent {
	
	public int chargeInterest() {
		return 0;
	}

}

//child class
class BankOfAmerica extends BankParent {  //public class can be only 1 (when we type all codes in one class
	@Override  //annotation - for visibility purposes
	public int chargeInterest() { 
		return 2;
	}
}

//child class 2
class PNC extends BankParent {
	@Override 
	public int chargeInterest() {
		return 3;
	}
}