package primitive;

/*
 * 
 * Byte data type is an 8-bit signed two's complement integer
 * Minimum value is -128 (-2^7)
 * Maximum value is 127 (inclusive)(2^7 -1)
 * Default value is 0
 * Byte data type is used to save space in large arrays, 
 * mainly in place of integers, since a byte is four times smaller than an integer.
 * Example: byte a = 100, byte b = -50
 *
 */

public class ByteDataType {

	public static void main(String[] args) {
		
		byte minValue = -128;
		byte maxValue = 127;
		
		byte firstValue = 100 + 15;
		byte newMinValue = (byte) (minValue / 2);
		
		System.out.println(firstValue);
		System.out.println(newMinValue);
	}
}
