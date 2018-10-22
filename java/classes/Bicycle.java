package classes;

/*
 * A class is a blueprint or prototype from which objects are created. 
 * This section defines a class that models the state and behavior of a real-world object. 
 * 
 */

public class Bicycle {

	/* 
	 * The Bicycle class has
	 * three fields 
	 */
	
	public int cadence;
	public int gear;
	public int speed;
	
	/*
	 * The Bicycle class has 
	 * one constructor
	 * 
	 */
	
	public Bicycle(int startCadence, int startGear, int startSpeed) {
		cadence = startCadence;
		gear = startGear;
		speed = startSpeed;
	}

	/*
	 * The Bicycle class has
	 * four methods
	 * 
	 */

	public void setCadence(int newValue) {
		this.cadence = newValue;
	}

	public void setGear(int newValue) {
		this.gear = newValue;
	}

	public void applyBrake(int decrement) {
		this.speed -= decrement;
	}
	private void speedUp(int increment) {
		this.speed += increment;

	}
	
	
}
