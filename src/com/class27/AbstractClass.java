package com.class27;
//abstract is a non access modifier
public abstract class AbstractClass {
/* 
 * Inside our class we can have our class members:
* -variables - String name;
* -methods - public void AbstractClass() { syso }
* Our class members can be static and non-static
* 
* Also we have constructors inside our class
* 
* The ABSTRACT Class is defined by using abstract keyword 
* abstract keyword is a non - access modifier 
* 
* Abstract class has implemented (has body - syso) and unimplemented 
* (no body-syso) methods. 
* 
* 
*/

	public void test() { //method has implementation
		System.out.println("I am a non static test method");
	}
	public abstract void hello();  //method without implementation - we add abstract
	                               //keyword so compiler won't complain
		
	
}
