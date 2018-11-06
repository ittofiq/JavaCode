package primitive;

/*
 * 
 * Short data type is a 16-bit signed two's complement integer
 * Minimum value is -32,768 (-2^15)
 * Maximum value is 32,767 (inclusive) (2^15 -1)
 * Short data type can also be used to save memory as byte data type. 
 * A short is 2 times smaller than an integer
 * Default value is 0.
 * Example: short s = 10000, short r = -20000 
 * 
 */

public class ShortDataType {
	
	public static void main(String[] args) {
		
		short minValue = -32768;
		short maxValue = 32767;
		
		short firstValue = 2500 + 40;
		
		short newMaxValue = (short)(maxValue/2);
		
		System.out.println(firstValue);
		System.out.println(newMaxValue);
	}

}
