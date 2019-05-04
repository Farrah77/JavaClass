package com.class32;

public abstract class Insurance {

    String insuranceName;
    
    public Insurance(String insuranceName){
        this.insuranceName=insuranceName;
    }
    public abstract void getQuote();
    public abstract void cancelInsurance();    
}
class Car extends Insurance{

    String carModel;

    public Car(String insuranceName, String carModel) {
        super(insuranceName);
        this.carModel=carModel;
    }
    public void getQuote() {
        System.out.println("Car mode "+carModel+" has insurence "+insuranceName);
        
    }
    @Override
    public void cancelInsurance() {
        System.out.println("Car model "+carModel+" cancel insurance "+insuranceName);
        
    }
}
class Pet extends Insurance{
    String petType;
    
    public Pet(String insuranceName,String petType ) {
        super(insuranceName);
        this.petType=petType;
    }
    public void getQuote() {
        System.out.println("Pet type "+petType+" has insurence "+insuranceName);
        
    }
    @Override
    public void cancelInsurance() {
        System.out.println("Pet type "+petType+" cancel insurance "+insuranceName);
        
    }
}
class Health extends Insurance{

    public Health(String insuranceName) {
        super(insuranceName);
        
    }

    @Override
    public void getQuote() {
        System.out.println("Health has insurence "+insuranceName);
    }

    @Override
    public void cancelInsurance() {
        System.out.println("Healt cancel insurance "+insuranceName);
        
    }
    
    
    
}
