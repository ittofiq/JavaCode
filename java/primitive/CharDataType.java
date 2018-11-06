package primitive;

/*
 *   Char data type is a single 16-bit Unicode character
 *   Minimum value is '\u0000' (or 0)
 *   Maximum value is '\uffff' (or 65,535 inclusive)
 *   Default value is '\u0000'
 *   Char data type is used to store any character
 *   Example: char letterA = 'A'
 *
 */

public class CharDataType {

	public static void main(String[] args) {
		char c = 'C';
		System.out.println(c);
		
		char charValue = '\u00A9';
		System.out.println("Unicode output:"+charValue);
		
		char register = '\u00AE';
		System.out.println("Registered simbul:"+register);
	}
}
