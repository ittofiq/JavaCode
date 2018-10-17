package operator;

/*
 * Operator 		Description
 * == 				equal to
 * != 				not equal to
 * 
 */

public class Equality {

	public static void main(String[] args) {
		int value1 = 1;
		int value2 = 2;
		
		// return false
		if(value1 == value2)
			System.out.println("value1 == value2");
		// return true
		if(value1 != value2)
			System.out.println("value1 != value2");
	}
}
