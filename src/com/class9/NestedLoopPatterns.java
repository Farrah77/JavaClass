package com.class9;

public class NestedLoopPatterns {

	public static void main(String[] args) {
//      for (int i=0; i<=5; i++) {
//      System.out.print(i);
//  }

  /*I want to print pattern
   * 123456789 -->rows =5, columns=9
   * 123456789
   * 123456789
   * 123456789
   * 123456789
   */
  
  for (int i=1; i<=5; i++) {
      
      for (int y=1; y<=9; y++) {
          
          System.out.print(y);//12345
      }
      System.out.println();
  }
  
  /*I want to print pattern
   * 1111111 --> rows=7, columns=7
   * 2222222
   * 3333333
   * 4444444
   * 5555555
   * 6666666
   * 7777777
   */
  
  for (int i=1; i<=7; i++) {
      
      for (int y=1; y<=7; y++) {
          System.out.print(i);//1111111 //2222222
      }
      System.out.println();
  }
  
  /*I want to print pattern
   *     ******   rows -4; columns -5;
   *     ******
   *     ******
   *     ******
   */
  
  
  for (int i=1; i<5; i++) {
	  
	  for (int y=1; y<6; y++) {
		  System.out.print("*");
	  } 
	  System.out.println();
  }
  
   /* print pattern 
    * 54321
    * 54321
    * 54321
    * 54321
    */
  
  for (int a=4; a>=1; a--) {
	  for (int b=5; b>=1; b--) {
		  System.out.print(b);
	  } System.out.println();
  }
  
  
  /* print pattern 
   *  55555
   *  44444
   *  33333
   *  22222
   *  11111
   */
  
  
  for (int x=5; x>=1; x--) {
	  for (int d=5; d>=1; d--) {
		  
		  System.out.print(x);
	  } System.out.println();
  }
  
  
  /* print pattern 
   *    *         number of your columns equals or less than number of rows, but not more. 
   *    **
   *    ***
   *    ****
   */

	for (int k=1; k<=4; k++) {          // outer loop is for rows, inner loop for columns, 
		                                // inner depends on outer loop
		for (int h=1; h<=k; h++) {
			System.out.print("*");
		} System.out.println();
	}
	
	/* print pattern:
	 *    *******      //rows = 4, columns=6
	 *    *     *
	 *    *     *
	 *    *******
	 * 
	 */
	
	
	for (int i=1; i<=4; i++) {
		
		for (int x=1; x<=6; x++) {
			 
			    
			if (i==1 || i==4 || x==1 || x==6) {
				System.out.print("*");
			} else {
				System.out.print(" ");
				} 	
			} 
		System.out.println();
	}
	}
	}


