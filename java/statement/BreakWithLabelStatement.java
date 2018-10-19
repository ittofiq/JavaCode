package statement;

/*
 * An unlabeled break statement terminates the innermost switch, while, do-while or for statement.
 * Use nested for loops to search for a value in a two-dimensional array.
 * When the value is found, a labeled break terminates the outer for loop (labeled "search")
 * 
 */

public class BreakWithLabelStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arrayOfInts = {
				{32, 87, 3, 589},
				{12, 1076, 2000, 8},
				{622, 127, 77, 955}
		};
		
		int searchFor = 12;
		
		int i;
		int j = 0;
		boolean foundIt = false;
		
		/*
		 * The break statement terminates the labeled statement;
		 * is does not transfer the flow of control to the label.
		 * Control flow is transferred to the statement immediately 
		 * following the labeled (terminated) statement.
		 */
		search:
		for (i =0; i < arrayOfInts.length; i++) {
			for (j = 0; j < arrayOfInts[i].length; j++) {
				if (arrayOfInts[i][j] == searchFor) {
					foundIt = true;
					break search;
				}
			}
		}
		
		if (foundIt) {
			System.out.println("Found "+ searchFor +" at "+ i + ", "+ j);
		} else {
			System.out.println(searchFor +"not in the array.");
		}
	}

}
