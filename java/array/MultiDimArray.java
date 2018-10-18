package array;

/*
 * You can also declare an array of arrays (also known as a multidimensional array) 
 * by using two or more sets of brackets, such as String[][] names. 
 * Each element, therefore, must be accessed by a corresponding number of index values.
 * In the Java programming language, 
 * a multidimensional array is an array whose components are themselves arrays. 
 * This is unlike arrays in C or Fortran. 
 * A consequence of this is that the rows are allowed to vary in length.
 * 
 */

public class MultiDimArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] names = {
							{"Mr. ", "Mrs. ", "Ms. "}, 
							{"Smith", "Jones"}
		};
		
		System.out.println(names[0][0] + names[1][0]);
		System.out.println(names[0][2] + names[1][1]);
		
		System.out.println(names.length);
	}

}
