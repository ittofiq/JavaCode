package array;

public class StringFile {

	public static void main(String[] args) {
		String name = "Lucy Heartfilia";
		
		System.out.println("String Leng:"+name.length());
		System.out.println("First char:"+name.charAt(0));
		System.out.println("Last Char:"+name.charAt(name.length()-1));
		
		System.out.println("Print char:");
		for(int i=0; i<name.length(); i++) {
			System.out.print(name.charAt(i));
		}
		
		System.out.println("\nPrint char reverse:");
		for(int i=name.length()-1; i>=0; i--) {
			System.out.print(name.charAt(i));
		}
		
		System.out.println("\nPrint words:");
		String word = "Close the World open the next";
		String[] split = word.split(" ");
		for(int i=0; i<split.length; i++) {
			if(i == 0 || i == 2) {
				System.out.println(split[i]);
			}
		}
		
		System.out.println("\nPrint words reverse:");
		for(int i=split.length-1; i>=0; i--) {
			if(i == 0 || i == 2) {
				System.out.println(split[i]);
			}
		}
	}

}
