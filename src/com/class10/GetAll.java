package com.class10;

public class GetAll {

	public static void main(String[] args) {
		
		        
		        String[] names= {"John", "Mike", "Jane", "Talgat", "Olga", "Mehmet", "Siyar"};
		        
		        int a=3;
		        System.out.println(names[a]);//Talgat
		       
		        a+=2;
		        System.out.println(names[a]);//Mehmet
		        
		        a-=4;
		        System.out.println(names[a]);//Mike
		        
		        int size=names.length;
		        System.out.println(size);

//		        System.out.println(names[0]);
//		        System.out.println(names[1]);
//		        System.out.println(names[2]);
		        
for (int i=0; i<size; i++) {  //when we want to print all names, instead typing 10 times, we use for loop
System.out.println(names[i]); }
		        
}
}
