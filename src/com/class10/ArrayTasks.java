package com.class10;

public class ArrayTasks {

	public static void main(String[] args) {
	
		char[] grades= {'A','B','C','D','E','F'};
		
		System.out.println(grades[1]);

		char[] grade = new char[6];
		grade[0]='A';
		grade[1]='B';
		grade[2]='C';
		grade[3]='D';
		grade[4]='E';
		grade[5]='F';
		
		System.out.println(grade[1]);
		
		/* Create an array of names and store all names of your group. 
		 * Then print your name from that array. (use 2 different ways of creating an array). 
		 */
		
		String[] names= {"Farrah", "Milena","Lola","Samir","Zaki"}; 
		
		System.out.println(names[0]);
		
		String[] name=new String[5];
		
		name[0]="Farrah";
		name[1]="Milena";
		name[2]="Lola";
		name[3]="Samir";
		name[4]="Zaki";
		
		System.out.println(name[0]);
		
		/* Create an array of words: Java, Saturday, day, coding, is. 
		 * Print the following sentence using element of array: “Saturday is Java coding Day”.
		 */
		
		String[] words = {"Java", "Saturday", "day", "coding", "is"};
		
		System.out.println(words[1]+" "+words[4]+" "+words[0]+" "+words[3]+" "+words[2]);
		
		String[] word = new String[5];
		
		word[0]="Java";
		word[1]="Saturday";
		word[2]="day";
		word[3]="coding";
		word[4]="is";
		
		
		String sentence= words[1]+" "+words[4]+" "+words[0]+" "+words[3]+" "+words[2];
		
		System.out.println(sentence);
int size = words.length;  // length of an words array is 5, which is int, so we declare and initialize int
		
		System.out.println("The size of an array "+size);
			}

}
