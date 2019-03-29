
public class Relationaloperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=19;
		int b=5;
		
		boolean result=a>b;
		boolean result1=a==b;
		
		System.out.println(result);
		System.out.println(result1);
		
		//compare 2 numbers and if a is larger than b --> print
		
		if (a>b) { //in parenthesis we have condition and we need to look at to execute
			System.out.println("a is larger than b");
		}
		else { //comparison - automatically false 
			System.out.println("b is larger than a");
		}
		
		double shoesPrice=32.99;
		double shoesAllowed=501;
		
		if (shoesPrice<=shoesAllowed) {
			System.out.println("I am buying the shoes");
			
		} else {
		System.out.println("I am NOT buying the shoes");
			}
		
	}

}
