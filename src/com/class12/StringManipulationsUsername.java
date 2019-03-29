package com.class12;

import java.util.Scanner;

public class StringManipulationsUsername {

	public static void main(String[] args) {
		
/* Accept username, password and confirm password and check following requirements:

1. Username and Password cannot be  empty, if so→ message=”Username and Password cannot be empty”.
2. Password should be minimum 8 characters, if less → message=”Password is too short”.
3. Password cannot contain username if so, → message=”Password cannot contain username”.
4. Password should match confirmed password, if not  → message “Passwords do not match”.
5. Only after all requirements met → message “Your username and password has been created” */
	
Scanner scan=new Scanner(System.in); 

String username;
String password; 
String confirmedPassword;


System.out.println("Please enter your username");
username=scan.nextLine();

System.out.println("Please enter your password");
password=scan.nextLine(); 

System.out.println("Please confrim your password");
confirmedPassword=scan.nextLine();

if (!(username.isEmpty() || password.isEmpty())) {
	if (password.length()>=8) {
		if (!(password.contains(username))) {
			if (password.equals(confirmedPassword)) {
				
				System.out.println("Your username and password have been created");
			} else {
			System.out.println("Passwords do not match");
			} 
			}  else {
			System.out.println("The password can not contain username.");
		    }
	        } else {
	        System.out.println("Password is too short");
	        }
            } else {
	     System.out.println("Username and Password can not be empty");
         }  
  
	}}  
