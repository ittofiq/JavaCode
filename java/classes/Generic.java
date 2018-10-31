package classes;

public class Generic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s = {"John", "Smith", "Luna", "Knight", "Viper"};
		Integer[] i = {1, 2, 3, 4, 5};
		Double[] d = {1.1, 2.2, 3.3, 4.4, 5.5};
		
		printState(s);
		printState(i);
		printState(d);
	}
	
	static <T>void printState(T[] array) {
		for(T s : array) {
			System.out.println(s);
		}
		System.out.println("------------------------");
	}

}
