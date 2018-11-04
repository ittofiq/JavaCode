package loop;

public class ControlLoop {

	public static void main(String[] args) {
		
		for(int i=0; i<10; i++) {
			
			if(i % 4 == 0) {
				System.out.println("continue");
				continue;
			}
			
			if(i == 7) {
				System.out.println("break");
				break;
			}
			
			System.out.println("count:"+i);
		}

	}

}
