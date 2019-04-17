package com.class24;

public class BankTest {

	public static void main(String[] args) {
		
		BankParent bp = new BankParent();
		BankOfAmerica boa = new BankOfAmerica();
		PNC pnc = new PNC();
		
		int interestRate;
		
		interestRate=bp.chargeInterest();
		System.out.println("Bank charges interest "+interestRate);
		interestRate=boa.chargeInterest();
		System.out.println("Bank of America charges interest "+interestRate);//2 - value reassigned
		interestRate=pnc.chargeInterest();
		System.out.println("Bank PNC charges interest "+interestRate);//3 - value of 2 reassigned to 3

	}

}
