package com.class25;

public class Casting {
	
	//Type casting: 2 types: - changing one value type into another 
	//- smaller into big - compiler does conversion - subclass into superclass
	//- bigger to smaller - you take care of it, superclass into subclass
	
	public static void main(String[] args) {
		//Implicit/Automatic/Widening - compiler takes care of conversion 
		double a=10;
		System.out.println(a);
		
		//Explicit/Manual/Narrowing - compiler won't take care of, programmer takes care of conversion
		double b=10.0;
		int c=(int)b;
		System.out.println(c);
		
		int i=130;
		//byte by=130 - complier won't allow
		byte by=(byte)i;
		System.out.println(by);
		
		//UpCasting --> --compiler takes care of conversion
				Payment pay=new MasterCard();
				
				//MasterCard mc=new Payment();--> compiler wont allow
				//DownCasting
				MasterCard mc=(MasterCard)new Payment();
				
	}
	
}