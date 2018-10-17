package operator;

/*
 * The instanceof operator compares an object to a specified type.
 * You can use it to test if an object is an instance of a class,
 * an instance of subclass, or an instance of a class that implements a particular interface.
 * 
 * 
 */

public class Comparison {
	
	public static void main(String[] args) {
	
		/*
		 * The program defines a parent class(named Parent),
		 * a simple interface (named MyInterface),
		 * and child class (named Child) that inherits from 
		 * parent and implements the interface.
		 * 
		 */
		
		Parent obj1 = new Parent();
		Child obj2 = new Child();
		
		// When using the instanceof operator, keep in mind that null is not an instance of anything.
		System.out.println("obj1 instanceof Parent: "+(obj1 instanceof Parent));
		System.out.println("obj1 instanceof Child: "+(obj1 instanceof Child));
		System.out.println("obj1 instanceof MyInterface: "+(obj1 instanceof MyInterface));
		
		System.out.println("obj2 instanceof Parent: "+(obj2 instanceof Parent));
		System.out.println("obj2 instanceof Child: "+(obj2 instanceof Child));
		System.out.println("obj2 instanceof MyInterface: "+(obj2 instanceof MyInterface));
	}
}

class Parent {}
class Child extends Parent implements MyInterface {}
interface MyInterface {}