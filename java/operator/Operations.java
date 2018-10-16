package operator;

public class Operations {
	
	/*
	 * Operators 				Precedence
	 * postfix 					expr++ expr--
	 * unary 					++expr --expr +expr -expr ~ !
	 * multiplicative 			* / %
	 * additive 				+ -
	 * shift 					<< >> >>>
	 * relational 				< > <= >= instanceof
	 * equality 				== !=
	 * bitwise AND 				&
	 * bitwise exclusive OR 	^
	 * bitwise inclusive OR 	|
	 * logical AND 				&&
	 * logical OR 				||
	 * ternary 					? :
	 * assignment 				= += -= *= /= %= &= ^= |= <<= >>= >>>=
	 * 
	 */
	
	public static void main(String[] args) {
		
		int x = 2;
		int y = 4;
		int z = 5;
		
		int sum = (x + y) * ++x - z--;
		
		System.out.println("Sum : "+sum);
		System.out.println("X : "+x);
		System.out.println("Z : "+z);
	}

}
