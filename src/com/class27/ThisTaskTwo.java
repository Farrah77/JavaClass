package com.class27;
/* 
 * Write program: user class  has a constructor that takes name and
 *  mobile number. Extend this class  by userInfo that will have user 
 *  address variable. Print users name, mobile number and address in 
 *  userDetails method. Test your code. 
 */

public class ThisTaskTwo {
	
	public String name;
	public long mobileNumber;
	
	//we use constructor because we initialize our variables
	public ThisTaskTwo(String name, long mobileNumber) {
		this.name = name; //we refer to variable on line 11
		this.mobileNumber = mobileNumber;
}
}
class UserInfo extends ThisTaskTwo {
	
  public String address; //to initialize address variable we go to constructor
	
   public UserInfo(String name, long mobileNumber, String address) {
	super(name, mobileNumber);
    this.address = address;
    
   }
 public void userDetails() {
	System.out.println("User name is "+name+ " and phone number is "
 +mobileNumber+" and address is "+address);
	}
}