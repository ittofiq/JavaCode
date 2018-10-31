package statement;

/*
 * Logic operator (>, >=, <, <=, ==, !=)
 * Logic gate (AND = &&, OR = ||, NOT = !)
 * 
 */

public class LogicStatement {
	
	public static void main(String[] args) {
		
		/*
		 * && (only true and true = TRUE, other FALSE)
		 * || (only false or false = FALSE, other TRUE)
		 * ! (only NOT(true) = FALSE, NOT(false) = TRUE)
		 * 
		 */
		System.out.println((3<5) && (5<7));
		System.out.println((4>=6) || (4<=2));
		System.out.println(!(2<4));
	}

}
