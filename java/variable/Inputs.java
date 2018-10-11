package variable;

import java.util.Scanner;

public class Inputs {
	static Scanner reader = new Scanner(System.in);
	
	// Variable untuk Char
	static Scanner readChar = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.print("Enter Name : ");
		String name = reader.nextLine();
		
		System.out.print("Enter Age : ");
		int age = reader.nextInt();
		
		System.out.print("Enter Salary : ");
		double salary = reader.nextDouble();
		
		System.out.print("Enter Gender : ");
		char gender = readChar.nextLine().charAt(0);
		
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Salary : "+salary);
		System.out.println("Gender : "+gender);
		
	}

}
