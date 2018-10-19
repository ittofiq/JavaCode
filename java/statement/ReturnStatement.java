package statement;

/*
 * The last of the branching statements is the return statement. 
 * The return statement exits from the current method, 
 * and control flow returns to where the method was invoked. 
 * The return statement has two forms: one that returns a value, and one that doesn't. 
 * To return a value, simply put the value (or an expression that calculates the value) after the return keyword.
 */
public class ReturnStatement {

	private static int restat;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		restat = getRestat(15);
		
		System.out.println(restat);
		
	}
	
	/*
	 * The data type of the returned value must match the type of the method's declared return value. 
	 * When a method is declared void, use the form of return that doesn't return a value.
	 * 
	 */
	public static int getRestat(int r) {
		return restat = r;
	}

}
