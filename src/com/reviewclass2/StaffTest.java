package com.reviewclass2;

public class StaffTest {
    
    
    public static void main(String[] args) {
        Professor obj1 = new Professor("John1", 100000, "28.09.2018","IT");
        Professor obj2 = new Professor("John2", 110000, "28.10.2018","IT");
        Professor obj3 = new Professor("John3", 120000, "28.11.2018","IT");
        
        Secretary obj01=new Secretary("Moss",55000,"12.12.2018","F@B");
        Secretary obj02=new Secretary("Moss1",55000,"13.12.2018","F@B");
        
        
        System.out.println("Combine salary is: "+(obj1.salary+obj2.salary+obj3.salary+obj01.salary+obj02.salary));
        
        
    }


}