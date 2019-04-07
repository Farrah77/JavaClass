package com.class18;

public class CalcApplication {

	public static void main(String[] args) {
	Calculator calc = new Calculator();
	
	calc.sum(12, 13, 14);  //we can write either int sum=calc.sum(12,13,14); OR
	
	System.out.println(calc.sum(12, 13, 14));
	System.out.println(calc.average(12, 13, 14));
	System.out.println(calc.min(12, 13, 14));
	System.out.println(calc.max(12, 13, 14));
	}
	

}
