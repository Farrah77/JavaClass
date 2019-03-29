package com.reviewclass;

public class NestedLoopPatternTask {

	public static void main(String[] args) {
		/**
         * Write a program to produce the following pattern
         *
....1
...2.
..3..
.4...
5....

         *
         */
        
        
        for (int p = 1; p <= 5; p++) {
            
            for (int j = 1; j <= (5 - p); j++) {
            System.out.print(".");
            }
            
            System.out.print(p);
            
            for (int j = 1; j <= (p - 1); j++) {
            System.out.print(".");
            }
            System.out.println();
            }
	}

}
