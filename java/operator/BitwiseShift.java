package operator;

public class BitwiseShift {

	public static void main(String[] args) {
		int bitMask = 0x000F;
		int val = 0x2222;
		
		// print 2
		System.out.println(val & bitMask);
	}
}
