package operator;

/*
 * The && and || operators perform Conditional-AND and Conditional-OR operations 
 * on two boolean expressions. These operators exhibit "short-circuiting" behavior, 
 * which means that the second operand is evaluated only if needed.
 * 
 */

public class Conditional {

	public static void main(String[] args) {
		int value1 = 1;
		int value2 = 2;
		
		// result is true
		if((value1 == 1) && (value2 == 2))
			System.out.println("value1 is 1 AND value2 is 2 = "+((value1 == 1) && (value2 == 2)));
		
		// result is true
		if((value1 == 1) || (value2 == 1))
			System.out.println("value1 is 1 OR value2 is 1 = "+((value1 == 1) || (value2 == 1)));
	}
}
