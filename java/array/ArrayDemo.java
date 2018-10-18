package array;

/*
 * An array is a container object that holds a fixed number of values of a single type. 
 * The length of an array is established when the array is created. 
 * After creation, its length is fixed.
 */

public class ArrayDemo {

	/*
	 * Each item in an array is called an element, 
	 * and each element is accessed by its numerical index. 
	 * numbering begins with 0.
	 */
	public static void main(String[] args) {
		
		// declares an array of integers
		int[] aArray;
		
		// allocates memory for 10 integers
		aArray = new int[10];
		
		aArray[0] = 100; // initialize first element
		aArray[1] = 200; // initialize second element
		aArray[2] = 300; // and so forth
		aArray[3] = 400;
		aArray[4] = 500;
		aArray[5] = 600;
		aArray[6] = 700;
		aArray[7] = 800;
		aArray[8] = 900;
		aArray[9] = 1000;
		
		System.out.println("Element at index 0: "+aArray[0]);
		System.out.println("Element at index 1: "+aArray[1]);
		System.out.println("Element at index 2: "+aArray[2]);
		System.out.println("Element at index 3: "+aArray[3]);
		System.out.println("Element at index 4: "+aArray[4]);
		System.out.println("Element at index 5: "+aArray[5]);
		System.out.println("Element at index 6: "+aArray[6]);
		System.out.println("Element at index 7: "+aArray[7]);
		System.out.println("Element at index 8: "+aArray[8]);
		System.out.println("Element at index 9: "+aArray[9]);
		
		// you can use the built-in length property to determine the size of any array
		System.out.println(aArray.length);
		
	}
}
