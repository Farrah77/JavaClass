package com.class12;

public class StringManipulations3 {

	public static void main(String[] args) {

		String str = "Students";
		
		char charactere = str.charAt(4); // returns you to specified index - E with index 4
		
		System.out.println(charactere);
		
		// to print each charachere
		
		for (int i=0; i<str.length(); i++) {
			System.out.print(str.charAt(i)+" ");
		}
		
		System.out.println();
System.out.println("------Index Of--------");
// returns an index of specified character
		
       String str1="Sunday";
	   int index = str1.indexOf("n");
	   System.out.println(index);
	   
	   System.out.println();
	   String str2 = "Syntax Technologies";
	   System.out.println(str2.indexOf("Syntaxt")); //0 because it is starts with 0, t finds the first index
	   System.out.println(str2.indexOf("Technologies"));//7 - because if finds the first index the wrd starts with
	   System.out.println(str2.indexOf(" ")); // index 6 holds space
	   System.out.println(str2.indexOf("w")); // -1 because there is no such value
	   
	   System.out.println("---------substring  -----------");
	   String str3 = "Today is Sunday Java class";
	   
	   String newString = str3.substring(9); // this function gives you another string from current string
	   System.out.println(newString);        // you can specify beginning or ending, beginning and ending
	   
	   System.out.println(str3.substring(0, 5)); // Today
	   System.out.println(str3.substring(9, 20)); //Sunday Java
	   System.out.println(str3.substring(16, 20)); //Java
	   System.out.println(str3.substring(21)); // class - you specify the index you want to stop
	}

}
