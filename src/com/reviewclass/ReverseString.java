package com.reviewclass;

public class ReverseString {
	
	void reverseString() {
        String str="seigolonhceT xatnyS";
        String reverse="";
        for(int i=str.length()-1;i>=0;i--) {
            reverse=reverse+str.charAt(i);
            System.out.println(reverse);
        }
        //System.out.println(reverse);
        
    }

}
