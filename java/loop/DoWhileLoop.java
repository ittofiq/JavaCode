package loop;

public class DoWhileLoop {

	public static void main(String[] args) {
		
		int i = 0;
		
		do {
			System.out.println("count:"+i);
			if(i % 4 == 0) {
				System.out.println("mode by 4 is:"+i);
			}
			i++;
		} while(i<10);

	}

}
