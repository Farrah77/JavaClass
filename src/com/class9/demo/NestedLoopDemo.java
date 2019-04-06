package com.class9.demo;

public class NestedLoopDemo {

	public static void main(String[] args) {
	NestedLoopDemo obj = new NestedLoopDemo();
	
	obj.showDemo();
		
	}
	void showDemo() {
		
		
     for (int i=1; i<=2; i++) {
            
            for (int y=0; y<=3; y++) {
                
                System.out.println(i+" "+y);
                
            }
        }
		
		
		
		
		
	}

}
