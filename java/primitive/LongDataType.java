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
		
		long l = 1_234_567_890_123_456_789L;
		System.out.println(l);
	}
}
