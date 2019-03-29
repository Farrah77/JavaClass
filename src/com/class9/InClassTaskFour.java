package com.class9;

public class InClassTaskFour {

	public static void main(String[] args) {
	/* Print pattern:
	 *   *
	 *   **
	 *   ***
	 *   ****
	 *   *****
	 *   ****
	 *   ***
	 *   **
	 *   *
	 */
			
for (int a=1; a<=5; a++) {
	for (int b=1; b<=a; b++) {
		System.out.print("*");
	} System.out.println();
} 

for (int x=1; x<=4; x++) {
	for (int y=4; y>=x; y--) {
		
		System.out.print("*");
	} System.out.println();
} 
	}

}
