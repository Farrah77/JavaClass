/**
 * 
 */
/**
 * @author farrah
 *
 */
package com.class14;
public class StringManipulations4 { 

	public static void main(String[] agrs) {
		
		// toCharArray() - converts string to array of characters
		
				String str="saturday";
				
				char[] array=str.toCharArray();
				for(int i=0; i<array.length; i++) {
					System.out.println(array[i]);
				}
				System.out.println("------For Each Loop------");
				for (char c:array) {
				       System.out.println(c);

				}
				System.out.println("------Printing in reverse-------");
				for (int i=array.length-1;i>=0; i--) {
					System.out.print(array[i]);
				}	
		
	}
}