package primitive;

/*
 *  Float data type is a single-precision 32-bit IEEE 754 floating point
 *  Float is mainly used to save memory in large arrays of floating point numbers
 *  Default value is 0.0f
 *  Float data type is never used for precise values such as currency
 *  Example: float f1 = 234.5f
 *  For that, you will need to use the java.math.BigDecimal class instead. 
 *  Numbers and Strings covers BigDecimal and other useful classes provided by the Java platform.
 * 
 */

public class FloatDateType {

	public static void main(String[] args) {
		
		float f = 123.1234567890f;
		
		float floatValue = 5f / 3f;
		
		System.out.println(floatValue);
	}
}
