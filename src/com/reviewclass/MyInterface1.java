package com.reviewclass;

public interface MyInterface1 {
	  
	  void m1();
	  
	}
	interface MyInterface2 extends MyInterface1 {
	  
	  void m1();
	  void m2();
	  
	}
	class Main implements MyInterface2 {
		  
		  public void m1() {
		    System.out.println("welcome to syntax students");
		  }
		  public void m2() {
		    System.out.println("hi syntax solutions how are you");
		  }
		  
		}