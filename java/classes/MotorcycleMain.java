package classes;

public class MotorcycleMain implements Motorcycle {

	int cadence = 0;
	int speed = 0;
	int gear = 1;
	
	@Override
	public void changeCadence(int newValue) {
		cadence = newValue;
	}

	@Override
	public void changeGear(int newValue) {
		speed = newValue;
	}

	@Override
	public void speedUp(int increment) {
		speed += increment;
	}

	@Override
	public void applyBrakes(int decrement) {
		speed -= decrement;
	}

	public void printeStates() {
		System.out.println("Cadence :"+cadence);
		System.out.println("Speed : "+speed);
		System.out.println("Gear : "+gear);
	}
	
	public static void main(String[] args) {
		
		MotorcycleMain motorCycle = new MotorcycleMain();
		motorCycle.changeCadence(50);
		motorCycle.changeGear(10);
		motorCycle.speedUp(2);
		motorCycle.printeStates();
	}

}
