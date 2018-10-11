package variable;

/*
 * Input console :
 * Compile dan dalankan via CMD
 * dimana sebelum menjalankan tambahkan paramater
 * untuk nilai varible nama dan provider.
 * 
 * java InputArgs Ittofiq JavaOracle
 */

public class InputArgs {
	
	public static void main(String[] args) {
		
		String name = args[0];
		String provider = args[1];
		
		System.out.println("Name : "+name);
		System.out.println("Provider : "+provider);
	}

}
