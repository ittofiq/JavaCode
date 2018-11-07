package primitive;

public class StringDataType {

	public static void main(String[] args) {
		String myString = "This is a string";
		System.out.println("myString is equal to " + myString);
		myString = myString + ", and this is more.";
		System.out.println("myString is equal to " + myString);
		myString = myString + " \u00A9 2018";
		System.out.println("myString is equal to " + myString);

		String numString = "250.55";
		numString = numString + "49.95";
		System.out.println("The result is " + numString);

		int myInt = 50;
		String lastString = "10";
		lastString = myInt + lastString;
		System.out.println("lastString is equal to " + lastString);
		double myDouble = 120.47;
		lastString = lastString + myDouble;
		System.out.println("lastString value : " + lastString);
	}

}
