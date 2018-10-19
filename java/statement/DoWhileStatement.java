package statement;

/*
 * The difference between do-while and while is that do-while evaluates its expression 
 * at the bottom of the loop instead of the top.
 */

public class DoWhileStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count = 1;
		
		/*
		 * The statement within the do block are always executed at least one.
		 */
		do {
			System.out.println("count is : "+ count);
			count++;
		} while (count < 11);
	}

}
