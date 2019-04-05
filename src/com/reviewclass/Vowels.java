package com.reviewclass;

public class Vowels {
	/* create a method that shows you all the vowels in a string
     output: should only show these characters a,e,i,o,u,A,E,I,O,U,
     this method can have any string value you put in, but must return
     all the vowels within the string */ 
	
	String weqas;
	
	public static void main(String[] args) {
		
		Vowels weqas=new Vowels();
		weqas.vowelCountWithLoop();
		weqas.vowelCountWithReplaceAll();
	
	} 
	void vowelCountWithLoop() {
	        String weqas="hello world my name Is wEqas";
	        
	        char[] w=weqas.toCharArray();
	        char empty;
	        for(int i=0;i<=w.length-1;i++) {
	            if(w[i]=='a'||w[i]=='A'||w[i]=='e'||w[i]=='E'||w[i]=='i'
	                    || w[i]=='I'||w[i]=='o'||w[i]=='O'||w[i]=='u'||w[i]=='U') {
	                empty=w[i];
	                System.out.print(empty+",");
	            }
	            
	        }
	        
	        
	        
	    }
	    
	    
	    void vowelCountWithReplaceAll() {
	        String weqas="hello world my name Is wEqas";
	        String replace =weqas.replaceAll("[^aA,eE,iI,oO,uU]", "");
	        //String replace =string.replaceAll("[^aA,eE,iI,oO,uU]", "");
	        System.out.println(replace);
	    } }

	
	
	
	


