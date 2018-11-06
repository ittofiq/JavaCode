package primitive;

 /* 
  *  double data type is a double-precision 64-bit IEEE 754 floating point
  *  This data type is generally used as the default data type for decimal values, generally the default choice
  *  Double data type should never be used for precise values such as currency
  *  Default value is 0.0d
  *  Example: double d1 = 123.4
  *  
  */

public class DoubleDataType {

	public static void main(String[] args) {
		
		double d = 123.12345678901234567890d;
		
		double doubleValue = 5d / 3d;
		System.out.println(doubleValue);
		
		double numPounds = 200;
		double convertedKilograms = numPounds * 0.45359237d;
		System.out.println("Kilograms:"+convertedKilograms);
	}
}
