package operator;

public class Priorites {
	/*
	 * Urutan Prioritas :
	 * 
	 * 0- ()
	 * 1- (++, -- before)
	 * 2- ^
	 * 3- Multiple and Division
	 * 4- Sum and Sub
	 * 5- =
	 * 6- (++, -- after)
	 */
	
	public static void main(String[] args) {
		
		int x = 2;
		int y = 4;
		int z = 5;
		
		int sum = (x + y) * ++x - z--;
		
		System.out.println("Sum : "+sum);
		System.out.println("X : "+x);
		System.out.println("Z : "+z);
	}

}
