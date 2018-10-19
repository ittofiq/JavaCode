package statement;

/*
 * The continue statement skips the current iteration of a while, do-while, for loop.
 * The unlabeled form skips to the end of the innermost loop's body and evaluates the boolean 
 * expression that controls the loop.
 */
public class ContinueStatement {

	/*
	 * Steps through a String, counting the occurences of the letter "p".
	 * If the current character is not a p, the continue statement skips the rest of 
	 * the loop and proceeds to the next character.
	 * If it a "p", then program increments the letter count.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String searchMe = "peter piper picked a " + "peck of picked peppers.";
		int max = searchMe.length();
		int numPs = 0;
		
		for (int i = 0; i < max; i++) {
			if(searchMe.charAt(i) != 'p')
				continue;
			numPs++;
		}
		
		System.out.println("Found "+ numPs + " p's in the String.");
	}

}
