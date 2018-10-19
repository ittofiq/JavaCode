package statement;

/*
 * The while statement continually executes block of statements while 
 * a particular condition is true.
 */

public class WhileStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 1;
		
		/*
		 * The while statement evaluates expression, which must return a boolean value.
		 * If the expression evaluates to true, the while statement executes the statements 
		 * in the while block. The while statement continues testing the expression 
		 * and executing its block until the expression evaluates to false.
		 */
		
		while(count < 11) {
			System.out.println("count is : "+count);
			count++;
		}
	}

}
