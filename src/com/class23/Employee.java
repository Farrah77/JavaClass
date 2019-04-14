package com.class23;

public class Employee {
	
	public int salary;
	
	protected int salary1;

	public void getPaid() {
		System.out.println("Employee get's paid " + salary);
		
	}
		
		protected void test() {
			System.out.println("I am protected method");
		}
		
		void test1() {
			System.out.println("I am default method");
		}
	}
