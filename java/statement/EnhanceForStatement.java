package statement;

/*
 * The for statement also has another form designed for iteration through
 * Collections and arrays this form is sometimes referred to as the enhanced statement,
 * and can be used to make your loops more compact and easy to read.
 */

public class EnhanceForStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		// The variable item holds the current value from the numbers array.
		for(int item : numbers) {
			System.out.println("count is : "+ item);
		}
	}

}
