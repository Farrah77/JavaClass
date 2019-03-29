package com.class11;

public class TwoDAraysTasks {

	public static void main(String[] args) {
		
		
		String[][] array = {
				           { "Mr", "Mrs","Ms", "Miss"},
				           {"Smith", "Jordan", "Jackson","Obama"}
		                   }; 
		
		System.out.println(array[0][1]+ " "+array[1][0]);
		System.out.println(array[0][0]+ " "+array[1][3]);
		System.out.println(array[0][2]+" "+array[1][2]);
		System.out.println(array[0][3]+" "+array[1][1]);
		
		
	
		String[][] grades = {
				            {"John", "Liz","Jenn","Frank"},
				            {"A", "B","C","F"}
				            };
		
		System.out.println(" ------Grades and Students--------");
		System.out.println(grades[0][0]+" has grade "+ grades[1][0]);
		System.out.println(grades[0][1]+" has grade "+ grades[1][1]);
	}

}
