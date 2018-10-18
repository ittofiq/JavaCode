package statement;

/*
 * The if-then-else statement provides a secondery path of execution 
 * when an "if" clause evaluates to false.
 * 
 */

public class IfElseStatement {

	public static void main(String[] args) {
		
		int testScore = 76;
		char grade;
		
		/*
		 * You may have noticed that the value of testscore 
		 * can satisfy more than one expression 
		 * in the compound statement: 76 >= 70 and 76 >= 60. 
		 * However, once a condition is satisfied, 
		 * the appropriate statements are executed (grade = 'C';) 
		 * and the remaining conditions are not evaluated.
		 */
		
		if(testScore >= 90) {
			grade = 'A';
		} else if (testScore >= 80) {
			grade = 'B';
		} else if (testScore >= 70) {
			grade = 'C';
		} else if (testScore >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		
		System.out.println("grade = "+ grade);
		
	}
	
}
