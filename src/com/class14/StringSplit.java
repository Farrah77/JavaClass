package com.class14;

public class StringSplit {

	public static void main(String[] args) {
	
String str="Welcome Syntax Stundets Batch4"; //split your function based on character you enter
// split cuts out the element you select
String[] array = str.split("S"); // because we split we got 3 strings inside one variable->we get array
System.out.println(array.length); //3

for (String substring:array) {
	System.out.println(substring);
	
}
System.out.println("-----Using For Loop--------");
for (int i=0; i<array.length; i++) {
	System.out.println(array[i]);
}
	}

}
