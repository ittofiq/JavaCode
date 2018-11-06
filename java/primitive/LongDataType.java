package primitive;

/*
 * Long data type is a 64-bit signed two's complement integer
 * Minimum value is -9,223,372,036,854,775,808(-2^63)
 * Maximum value is 9,223,372,036,854,775,807 (inclusive)(2^63 -1)
 * This type is used when a wider range than int is needed
 * Default value is 0L
 * Example: long a = 100000L, long b = -200000L
 * 
 */

public class LongDataType {

	public static void main(String[] args) {
		
		long minValue = -9_223_372_036_854_775_808L;
		long maxValue = 9_223_372_036_854_775_807L;
		
		byte byteValue = 10;
		short shortValue = 20;
		int intValue = 50;
		
		short shortTotal = (short) (1000 + 10 * (byteValue + shortValue + intValue));
		long longTotal = 50000L + 30L * (byteValue + shortValue + intValue);
		System.out.println(shortTotal);
		System.out.println(longTotal);
	}
}
