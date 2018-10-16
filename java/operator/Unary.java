package operator;

/*
 * Operator 		Description
 * +				Unary plus operator; indicates positive value (numbers are positive without this, however)
 * - 				Unary minus operator; negates an expression
 * ++ 				Increment operator; increment a value by 1
 * --				Decrement operator; decrement a value by 1
 * !				Logical complement operator; inverts the value of a boolean
 * 
 */

public class Unary {

	public static void main(String[] args) {
		int result = +1; //	result is now 1
		System.out.println(result);
		
		result--; // result is now 0
		System.out.println(result);
		
		result++; // result is now 1
		System.out.println(result);
		
		result = -result; // result is now -1
		System.out.println(result);
		
		Boolean success = true;
		System.out.println(success); // success is now true
		System.out.println(!success); // success is now false
	}
}
