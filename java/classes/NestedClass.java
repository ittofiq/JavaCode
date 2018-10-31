package classes;

public class NestedClass {

	static class Animal {
		String name;
		String voice;
	}
	
	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.name = "Monkey";
		animal.voice = "Kye.. Kye.. Kye..";
		
		System.out.println("Name : "+animal.name);
		System.out.println("Voice : "+animal.voice);
	}

}
