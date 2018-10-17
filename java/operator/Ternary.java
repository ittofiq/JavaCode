package operator;

/*
 * Another conditional operator is ?:, 
 * which can be thought of as shorthand for an if-then-else statement.
 * 
 * This operator is also known as the ternary operator because it uses three operands.
 * 
 */

public class Ternary {

	public static void main(String[] args) {
		int value1 = 1;
		int value2 = 2;
		
		int result;
		Boolean checkCondition = true;
		
		/*
		 * This operator should be read as:"If checkCondition is true, assign the value of value1 to result.
		 * Otherwise, assign the value of value2 to result"
		 * 
		 */
		result = checkCondition ? value1 : value2;
		
		System.out.println(result);
	}
}
