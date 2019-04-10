package com.class19;

public class TaskMethods {

	
	
	public static void main(String[] args) {
		
		TaskMethods obj = new TaskMethods();
		String email = obj.createEmail("John","Snow","gmail");
		System.out.println(email);
		
		email = obj.createEmail("Bob", "Snow",  "outlook");
		System.out.println(email);

} 
	String createEmail(String name, String lastName, String emailType) {
		  String email= name+lastName+"@"+emailType+".com";
	      return email.toLowerCase();
		
	}
	
}
