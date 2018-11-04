package array;

import java.util.Scanner;

public class ArrayInput {
	
	// Take the inputs from user
	static Scanner reader = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		// Default index array is 0
		String[] name = new String[5];
		
		System.out.println("Enter name :");
		
		for(int i=0; i<name.length; i++) {
			name[i] = reader.nextLine();
		}
		
		System.out.println(" ");
		
		for(int i=0; i<name.length; i++) {
			System.out.println(name[i]);
		}
		
	}

}
