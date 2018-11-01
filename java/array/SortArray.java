package array;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Person> listName = new ArrayList<>();
		listName.add(new Person("Lina", 21));
		listName.add(new Person("Bloodseker", 25));
		listName.add(new Person("Viper", 27));
		
		System.out.println("Print before sort");
		print(listName);
		
		System.out.println("---------------------------");
		
		Collections.sort(listName);
		System.out.println("Print after sort");
		print(listName);
	}
	
	private static void print(ArrayList<Person> listName) {
		// TODO Auto-generated method stub
		for(Person person : listName) {
			System.out.println("name : "+person.name);
			System.out.println("Age : "+person.age);
		}
	}

}

class Person implements Comparable<Person>{
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		return this.age - o.age;
	}
}