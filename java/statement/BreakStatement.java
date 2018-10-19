package statement;

/*
 * The break statement has two forms: labeled and unlabeled.
 * You can also use an unlabeled break to terminate a while, do-while or for loop.
 * 
 */

public class BreakStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arrayOfInts = {32, 87, 3, 589, 12, 1076, 2000, 8, 622, 127};
		int searchFor = 12;
		
		int i;
		boolean foundIt = false;
		
		/*
		 * This program search for the number 12 in an array.
		 * The break statement, show in boldface, terminates the for loop
		 * when that value is found.
		 * Control flow then tranfers to the statement after the for loop.
		 */
		
		for (i = 0; i < arrayOfInts.length; i++) {
			if (arrayOfInts[i] == searchFor) {
				foundIt = true;
				break;
			}
		}
		
		if (foundIt) {
			System.out.println("Found "+ searchFor +" at index "+ i);
		} else {
			System.out.println(searchFor +" not in the array.");
		}
	}

}
