package com.class5;

public class LogicalOperatorsOrWeekDay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		/* we have 7 days a week
		 * if day is 1-5 ->weekday
		 * if day 6-7 ->weekend
		 */
	
	int day=3;
	
	if (day==1 || day==2 || day==3 || day==4 || day==5) {
		System.out.println("It is a weekday");
	} else if (day==6 || day==7) {
		System.out.println("It is a weekend");
	} else {
		System.out.println("Not valid data");
	}

}}
