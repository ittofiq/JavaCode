package primitive;

/*
 * 
 * Int data type is a 32-bit signed two's complement integer.
 * Minimum value is -2,147,483,648 (-2^31)
 * Maximum value is 2,147,483,647(inclusive) (2^31 -1)
 * Integer is generally used as the default data type 
 * for integral values unless there is a concern about memory.
 * The default value is 0
 * Example: int a = 100000, int b = -200000
 *
 */

public class IntegerDataType {

	public static void main(String[] args) {
		
		int minValue = -2147483648;
		int maxValue = 2_147_483_647;
		
		int firstValue = 5+3;
		int secondValue = (2*4) + (4-2);
		int totalValue = 10 + firstValue + secondValue;
		
		int newMinValue = minValue/2;
		
		System.out.println(minValue);
		System.out.println(maxValue);
		
		System.out.println(totalValue);
		System.out.println(newMinValue);
	}
}
