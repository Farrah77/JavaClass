package com.class28;

public class BankTest {
	
	public static void main(String[] args) {
		 Bank bank = new BOA(); //we can change PNC
		 bank.hasChecking();
		 bank.hasSavings();
		 bank.hasCreditCard();
		 System.out.println(Bank.hello);
	}

}
