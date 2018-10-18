package statement;

/*
 * Unlike if-then and if-then-else statements, 
 * the switch statement can have a number of possible execution paths.
 * A swicth work with the byte, short, char and int primitive data types.
 * It also work with enumerated types, the String class, and a few special classes
 * that wrap certain primitive types: Character, Byte, Short, and Integer.
 * 
 */

public class SwitchStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month = 8;
		String monthString;
		
		/*
		 * The body of a switch statement is known as a switch block. 
		 * A statement in the switch block can be labeled with one or more case or default labels. 
		 * The switch statement evaluates its expression, 
		 * then executes all statements that follow the matching case label.
		 */
		
		switch (month) {
		case 1:
			monthString = "January";
			break;
		case 2:
			monthString = "February";
			break;
		case 3:
			monthString = "March";
			break;
		case 4:
			monthString = "April";
			break;
		case 5:
			monthString = "May";
			break;
		case 6:
			monthString = "June";
			break;
		case 7:
			monthString = "July";
			break;
		case 8:
			monthString = "August";
			break;
		case 9:
			monthString = "September";
			break;
		case 10:
			monthString = "October";
			break;
		case 11:
			monthString = "November";
			break;
		case 12:
			monthString = "December";
			break;
		default:
			monthString = "Invalid Month";
			break;
		}
		
		System.out.println(monthString);
	}

}
