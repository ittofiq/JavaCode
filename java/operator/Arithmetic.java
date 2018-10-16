package operator;

/*
 * Operator 	Description
 * +			Additive operator (also used for String concatenation
 * -			Subtraction operator
 * * 			Multiplication operator
 * /			Division operator
 * % 			Remainder operator
 * 
 */

public class Arithmetic {

	public static void main(String[] args) {
	
		int x = 1 + 2;	// x is now 3
		System.out.println("1 + 2 = "+ x);
		int result = x;
		
		x = x - 1;	// x is now 2
		System.out.println(result +" - 1 = "+ x);
		result = x;
		
		x = x * 2;	// x is now 4
		System.out.println(result +" * 2 = "+ x);
		result = x;
		
		x = x / 2;	// x is now 2
		System.out.println(result +" / 2 = "+ x);
		result = x;
		
		x = x + 8;	// x is now 10
		System.out.println(result +" + 8 = "+ x);
		result = x;
		
		x = x % 7;	// x is now 3
		System.out.println(result +" % 7 = "+ x);
		
		//	+ Additive used for String concatenation
		String first = "Thanks ";
		String last = "you.";
		System.out.println(first + last);
	}
}
