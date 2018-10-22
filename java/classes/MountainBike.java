package classes;

/*
 * A class declaration for a MountainBike class that is a subclass of Bicycle.
 * The MountainBike inherits all the fields and methods of Bicycle and 
 * add the field seatHeight and a method to set it.
 * 
 */

public class MountainBike extends Bicycle {

	/*
	 * The MountainBike subclass has 
	 * one field
	 */
	public int seatHeight;
	
	/*
	 * The MountainBike has
	 * one constructor
	 */
	
	public MountainBike(int startHeight, int startCadence, int startGear, int startSpeed) {
		super(startCadence, startGear, startSpeed);
		// TODO Auto-generated constructor stub
		
		seatHeight = startHeight;
	}
	
	/*
	 * The MountainBike has
	 * one method
	 */
	public void setHeight(int newValue) {
		this.seatHeight = newValue;
	}
	
}
