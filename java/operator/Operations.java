package operator;

public class Operations {

	/*
	 * Operators Precedence postfix expr++ expr-- unary ++expr --expr +expr
	 * -expr ~ ! multiplicative * / % additive + - shift << >> >>> relational <
	 * > <= >= instanceof equality == != bitwise AND & bitwise exclusive OR ^
	 * bitwise inclusive OR | logical AND && logical OR || ternary ? :
	 * assignment = += -= *= /= %= &= ^= |= <<= >>= >>>=
	 * 
	 */

	public static void main(String[] args) {
		int result = 1 + 2;
		System.out.println("1 + 2 = " + result);

		int prevResult = result;
		result = result - 1;
		System.out.println(prevResult + " - 1 = " + result);

		prevResult = result;
		result = result * 10;
		System.out.println(prevResult + " * 10 = " + result);

		prevResult = result;
		result = result / 5;
		System.out.println(prevResult + " / 5 = " + result);

		prevResult = result;
		result = result % 3;
		System.out.println(prevResult + " % 3 = " + result);

		prevResult = result;
		result = result + 1;
		System.out.println("Result = " + result);

		++result;
		System.out.println("++result = " + result);

		--result;
		System.out.println("--result = " + result);

		result--;
		System.out.println("result-- = " + result);

		result++;
		System.out.println("result++ = " + result);

		result += 2;
		System.out.println("result += 2 = " + result);

		result *= 10;
		System.out.println("result *= 10 = " + result);

		result -= 10;
		System.out.println("result -= 10 = " + result);

		result /= 10;
		System.out.println("result /= 10 = " + result);

		boolean isAlien = false;
		if (isAlien == false)
			System.out.println("It is not an alien!");

		int topScore = 80;
		if (topScore < 100)
			System.out.println("You got the high score!");

		int secondTopScore = 60;
		if ((topScore > secondTopScore) && (topScore < 100))
			System.out.println("Greather than second top score and less then 100");

		if ((topScore > 90) || (secondTopScore <= 90))
			System.out.println("One of these tests is true");

		int newValue = 50;
		if (newValue == 50)
			System.out.println("This is true");

		boolean isCar = false;
		if (isCar == true)
			System.out.println("This is not supposed to happen");

		isCar = true;
		boolean wasCar = isCar ? true : false;
		if (wasCar)
			System.out.println("wasCar is true");
	}

}
