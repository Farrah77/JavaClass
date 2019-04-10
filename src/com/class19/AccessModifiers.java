package com.class19;

public class AccessModifiers {
/* Create a method that will take 1 parameter as a String and return reversed String. 
* Method should be visibly only within same package: default or protected
*/
	
public static void main(String[] args) {
	
	AccessModifiers obj = new AccessModifiers();
	String reversed = obj.reverseString("Hello");
	System.out.println(reversed);
	
	obj.isPalindrome("kayak");
	System.out.println(obj.isPalindrome("kayak"));
	
	String[] array= obj.getWordsFromString("Online Students Hello"); 
	System.out.println("------For Loop------"); 
	for (int i=0; i<array.length; i++) { //1 option
		 System.out.println(array[i]);
	 }
	
	 System.out.println("-----Enhanced Loop------");
	for (String word:array)	{             //2 option
		System.out.println(word);
	}
}
	
	
	protected String reverseString(String str) {
	
	String reversed="";//before for loop otherwise it will be empty 
	
	for (int i=str.length()-1; i>=0; i--) { //index starts from 0 thts why we need -1
		
		reversed+=str.charAt(i);
	}
	return reversed;
	}
	
/* Create a method that will take a String and return whether String is palindrome or not. 
 * Method should available to all classes within your projects: public
 */
	
public boolean isPalindrome(String str) {
	
//String reversed="";
//for (int i=str.length()-1; i>=0; i--) { // one option
//reversed+=str.charAt(i);
	
String reversed=reverseString(str); // we call the method that we created before not to repeat
                                    // writing already written code. WE CAN CALL METHOD WITHIN a METHOD	
	                                
 if (reversed.equalsIgnoreCase(str)) {
	return true;
} else {
	return false;
} }
	
 /* Create a method that will take a string and return array of words from that string. 
  * Method should be available only within same class: private   
  */
		
private String[] getWordsFromString(String str) {
	
	String[] words = str.split(" ");
	return words;
	
}

	}
	
	


