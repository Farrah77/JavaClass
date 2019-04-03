package com.class14;

public class StrManNumberOfSentences {

	public static void main(String[] args) {
/* ou have a String a=“Is it saturday! Is it raining! Do we have a Java Class today?” 
 * How would you find out how many sentences are in that String?
 */
		 String a="Is it Saturday? Is it raining? Do we have a Java Class today?";
		    String[] sr1=a.split("[?]");
		    System.out.println(sr1.length);
		    
		    
/* Another option:
 * String f="Is it Saturday! Is it raining? Do we have a Java Class Today";
   String [] array= f.split("\\?");
   System.out.println("The number of sentences in string is: "+array.length); */
	}

}
