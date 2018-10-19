package statement;

/*
 * The for statement provides a compact way to iterate over a range of values.
 * Programmers often refer to it as the "for loop" because of the way in which it repeatedly loops
 * until a particular condition is satisfied.
 * 
 */

public class ForStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Notice how the code declares a variable within the initialization expression. 
		 * The scope of this variable extends from its declaration to the end of the block governed by the for statement, 
		 * so it can be used in the termination and increment expressions as well. 
		 * If the variable that controls a for statement is not needed outside of the loop, 
		 * it's best to declare the variable in the initialization expression. 
		 * The names i, j, and k are often used to control for loops; 
		 * declaring them within the initialization expression limits their life span and reduces errors.
		 */
		
		for(int i=1; i < 11; i++) {
			System.out.println("count i: "+i);
		}
	}

}
