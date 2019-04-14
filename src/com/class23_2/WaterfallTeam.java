
package com.class23_2;

import com.class23.Employee;

public class WaterfallTeam extends Employee {
	
	public static void main(String[] args) {
		
		WaterfallTeam wt = new WaterfallTeam();
		
		wt.salary1=90000;// can access protected values from different package through inheritance
		//wt.salary ; default values can not be accessible in different package
		
		
			
		}
	}
//Private members (variables and methods DO NOT get inherited	
//Protected VS Default
// can access protected values from different package through inheritance
//wt.salary ; default values can not be accessible in different package
