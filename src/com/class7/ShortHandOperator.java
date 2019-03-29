package com.class7;

public class ShortHandOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 1. Declare variable and increase by 100 using shorthand operator
         * 2. Declare variable and decrease by 67 using shorthand operator
         * 3. Declare variable cakePiece=11 and divide cakePiece between 4 people using shorthand operator
         * each person should get an equal piece of cake
         *
         * 4. Declare variable cakePiece=25 and divide cakePiece between 7 people
         * using shorthand operator found out how many pieces of cake left after it was distributed equally 
         * among 7 people
		*/
		
		int a=100;
		a+=100;
		System.out.println(a);
		
		int b=200;
		b-=67; 
		System.out.println(b);
		
	int  cakePieces=11;
	cakePieces/=4;
	System.out.println(cakePieces);
	
		int cakePiece=25;
		cakePiece%=7;
		System.out.println(cakePiece);
		
	}
	

}
