
public class Modulus {

	public static void main(String[] args) {

		int a = 10;
		int b = 3;

		int div = a / b;

		System.out.println(div);// Since it is int answer is 3

		// modulus operator - shows what is the remainder for the division
        // modulus %
		
		int mod=a%b;
		System.out.println(mod); 
		
		int q=23;
		int v=11;
		
		System.out.println(q%v);//the remainder is 1 cos in 23 (11+11)+1
		
	    int e=-5+4*6;
	    System.out.println(e);//19
	    
	    int x=(22+9)%7;
	    System.out.println(x);//3
	    
	    int z= 5+15/3*2 - 8%3; //(5+10-2) 
	    System.out.println(z); //13
	    
	    
	}
}
