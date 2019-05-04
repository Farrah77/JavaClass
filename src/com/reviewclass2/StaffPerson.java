package com.reviewclass2;

/*A university department consists of professors and secretaries. 
 * Each professor and each secretary has a name, a salary, and a hire 
 * date. Use inheritance and polymorphism to create an application 
 * that represents the department and its professors and secretaries 
 * as objects, and provides a test class that creates 3 professors and
 *  2 secretaries, and then outputs the combined total of all of their 
 *  salaries.
 */
 
public abstract class StaffPerson {
    
    String name;
    int salary;
    String hireDate;
    String department;

    StaffPerson(String name, int salary, String hireDate,String department) {
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
        this.department=department;
    }

    

}

class Secretary extends StaffPerson {

    Secretary(String name, int salary, String hireDate,String department) {
        super(name, salary, hireDate,department);
        // TODO Auto-generated constructor stub
        
        System.out.println(name+" is a secretary works at the "+ department+ " department, and was hired at "+hireDate);
    }

    

    

}

class Professor extends StaffPerson {

    Professor(String name, int salary, String hireDate,String department) {
        super(name, salary, hireDate,department);
        // TODO Auto-generated constructor stub
        System.out.println(name+" is a professor works at the "+ department+ " department,and was hired at "+hireDate);
    }

    

}

