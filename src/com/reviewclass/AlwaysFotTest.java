package com.reviewclass;

class Main {
static char getChar(String word, int index) {
for (int i = 0; i<= word.length(); i++) {
word.charAt(i);
}  
return word.charAt(index); }
	
	//test case below (dont change):
	public static void main(String[] args){
		System.out.println(getChar("hello",1)); //should be 'e'
	}
}
