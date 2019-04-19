package com.class22;

public class Polymorphism {
	
	/* 
	 * 2. Polymorphism - ability of object to take (have) many forms/behaviors
 * I as an object have different types of behaviors 
 * It is about behaviors not variables. 
 * 
 * In JAVA 2 types of P/M:
 * 1 - Compile type (or static binding, or early binding)
 * Compile type can be achieved through method overloading 
 * 2. Runtime  type (or dynamic binding, or late binding) 
 * Runtime type can be achieved through method method overriding 
 * 
 * OVERLOADING:
 * we can overload the METHOD and CONSTRUCTOR
 * 
 *  Method overloading can be achieved in 2 ways: (same method used many times)
 *  
 *  - by changing number or arguments (or parameters)
 * 
 *  - by changing data type of the parameters
 *  
 * Method overloading is not possible with return type - compiler will give an error
 * IQ: We can overload Constructor (by changing number of parameters or Data Type of parameters
 * IQ: Can we overload main method? Yes, we can. Java always executed the main method (regular) first
 * 
 * When we talk about method OVERLOADING we mean method SIGNATURE (we can try different access modifiers 
 * but method signatures should be different. 
 * 
 * In JAVA method OVERLOADING is not possible by changing the return type of the method - name and 
 * parameters should be different. 
 * 
 * IQ: Can we overload private, protected, static, default methods? - YES, any method can be overloaded within 1 class
 * 
 * 
 * OVERRIDING 
 *The same method in different classes (Parent-Child)
 *Without inheritance overriding is not possible 
 *ADVANTAGES of OVERRIDING 
 *
 *CHILD class is allowed to provide its implementation without affecting PARENT class or other subslasses 
 *
 *RULES:
 *Method must have the same name both in parent and child classes
 *Method must method signature (name and parameters) the same
 *
 * In Method OVERRIDING:
 * we can override method only when there is inheritance (parent-child classes)
 * same method name in Parent and Child classes
 * 
 * ACCESS MODIFIERS 
 * can not be more restrictive than in parent class(if parent has public, child method also should be public - the biggest)
 * or if it is protected in parent class, we can't make it default (less), just protected or public
 * so logic is either same or bigger (more restrictive)
 * 
 * PRIVATE Methods can't be overridden since they don't participate in inheritance.
 * 
 * RETURN type must be the same 
 * 
 * PARAMETERS: if parameters involved, always will be executed parent method (even if child method has different parameters)
 *
 *IQ: STATIC METHODS can NOT be overridden 
 *While calling a method using superclasse reference you will get access ONLY to parent class method
 *This process is named METHOD HIDING
 *We can have Method hiding but not method overriding 
 *
 *Can we OVERRIDE a Constructor (or Special Method)? No 
 *
 *IQ: We can't override main method - it is static 
 *IQ: We can't override final method 
	 */

}
