package array;

import java.util.Arrays;

/*
 * Java SE provides several methods for performing array manipulations 
 * (common tasks, such as copying, sorting and searching arrays) in the java.util.Arrays class. 
 * The difference is that using the copyOfRange method 
 * does not require you to create the destination array before calling the method, 
 * because the destination array is returned by the method.
 * 
 */

public class ArrayManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] copyFrom = {'d', 'e', 'c', 'a', 'f', 'f', 'e', 
				'i', 'n', 'a', 't', 'e', 'd'};
		
		char[] copyTo = Arrays.copyOfRange(copyFrom, 2, 9);
		
		System.out.println(new String(copyTo));
	}

}
