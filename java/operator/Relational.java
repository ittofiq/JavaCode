package operator;

/*
 * Operator 		Description
 * > 				greater than
 * >= 				greater than or equal to
 * < 				less than
 * <= 				less than or equal to
 * 
 */

public class Relational {

	public static void main(String[] args) {
		int value1 = 1;
		int value2 = 2;
		
		// return false, not printed
		if(value1 > value2)
			System.out.println("value1 > value2");
		// return false, not printed
		if(value1 >= value2)
			System.out.println("value1 >= value2");
		// return true and printed
		if(value1 < value2)
			System.out.println("value1 < value2");
		// return true and printed
		if(value1 <= value2)
			System.out.println("value1 <= value2");
	}
}
