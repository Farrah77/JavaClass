package com.class11;

public class ForLoopsTask2Option2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] country = {"Russia", "Canada", "USA", "China"}; 
		
		System.out.println("---------For Loop---------");
		for (int i=0; i<country.length; i++) {
			
			if (country[i].contentEquals("Russia")) {
				System.out.println("Moscow");
			} else if (country[i].contentEquals("Canada")) {
				System.out.println("Ottawa");
			} else if (country[i].contentEquals("USA")) {
				System.out.println("Washington,D.C.");
			} else if (country[i].contentEquals("China")) {
				System.out.println("Beijing");
			}
		}
		
		//option 3 - SWITCH 
		
		String[] state= {"Spain", "Italy", "Greece", "Portugal"}; 
		
		
		System.out.println("--------Advanced For Loop--------");
		for (String countries:state) {
			
			switch(countries) {
			case "Spain":
				System.out.println("Madrid");
				break;
			case "Italy":
				System.out.println("Rome");
				break;
			case "Greece":
				System.out.println("Athens");
				break;
			case "Portugal":
				System.out.println("Lisbon");
				break;
			
			}
		}
		}
	}


