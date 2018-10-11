package operation;

import java.util.Calendar;
import java.util.Scanner;

public class MyAge {

	static Scanner reader = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.print("Enter BOD : ");
		int dob = reader.nextInt();
		int year = Calendar.getInstance().get(Calendar.YEAR);
		int age = year - dob;
		
		System.out.println("Your age ("+age+") years");
	}
	
}
