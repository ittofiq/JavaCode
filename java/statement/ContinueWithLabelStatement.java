package statement;

/*
 * The labeled continue statement skips the current interation 
 * of an outer loop marked with the given label.
 */

public class ContinueWithLabelStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Uses the nested loops to search a substring within another string.
		 * Two nested loops are required: one to iterate over the substring 
		 * and one to iterate over the string being searched.
		 */
		
		String searchMe = "Look for a substring in me";
		String subString = "sub";
		boolean foundIt = false;
		
		int max = searchMe.length() - subString.length();
		// Uses the labeled form of continue to skip an interation in the outer loop.
	test:
		for (int i = 0; i <= max; i++)	{
			int n = subString.length();
			int j = i;
			int k = 0;
			
			while(n-- != 0) {
				if (searchMe.charAt(j++) != subString.charAt(k++)) {
					continue test;
				}
			}
			
			foundIt = true;
			break test;
		}
		
		System.out.println(foundIt ? "Found it" : "Didn't find it");
	}

}
