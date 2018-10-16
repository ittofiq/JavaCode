package operator;

/*
 * Operator 		Description
 * prefix(++expr)	evaluates to the incremented value
 * postfix(expr++)	evaluates to the original value
 * 
 * will both end in result being incremented by 1.
 * 
 */
public class PrePostFix {
	
	public static void main(String[] args) {
	
		int i = 3;
		i++;
		
		// prints 4
		System.out.println(i);
		++i;
		
		// prints 5
		System.out.println(i);
		
		// prints 6
		System.out.println(++i);
		
		// prints 6
		System.out.println(i++);
		
		// prints 7
		System.out.println(i);
	}

}
