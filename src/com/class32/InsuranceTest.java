package com.class32;

import java.util.ArrayList;

public class InsuranceTest {

    public static void main(String[] args) {
        
    Insurance obj=new Car("AIG","BMW");
    
    Insurance obj1=new Pet("Geico", "cat");    
        
    Insurance obj2=new Health("Kaiser");
        
    ArrayList<Insurance> alist=new ArrayList<>();
    
    alist.add(obj);
    alist.add(obj1);
    alist.add(obj2);
    
    for (Insurance ins:alist) {
        System.out.println(ins.insuranceName);
        ins.getQuote();
        ins.cancelInsurance();
    }
        
        
        
        
        
    }
    
    
    
    
    
    
}