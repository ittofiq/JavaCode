package operator;

/*
 * Assignment 
 * 	= 
 * 	+=
 * 	-=
 * 	*=
 * 	/=
 * 	%=
 * 	^=
 * 	|=
 * 	<<=
 * 	>>=
 * 	>>>=
 * 
 */

public class Assignment {
	
	public static void main(String[] args) {
		
		// simple assignment operator
		int x = 2;
		int y = 6;
		int z = 8;
		
		x += x;	// x = x + x
		y -= x;	// y = y - x
		z *= y;	// z = z * y
		
		System.out.println("x : "+x);
		System.out.println("y : "+y);
		System.out.println("z : "+z);
	}
}
