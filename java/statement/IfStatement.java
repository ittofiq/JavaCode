package statement;

/*
 * The if-then statement is the most basic of all control flow statement.
 * It tells your program to execute a certain section of code only if a particular test evaluates to true.
 * If this test evaluates to false, control jumps to the end of the if-then statement.
 * 
 */
public class IfStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean b = true;
		
		/* 
		 * In addition, the opening and closing braces are optional, 
		 * provided that the "then" clause contains only one statement
		 */
		if(b) {
			System.out.println(b);
		}
	}

}
