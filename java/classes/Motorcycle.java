package classes;

public interface Motorcycle {

	void changeCadence(int newValue);
	
	void changeGear(int newValue);
	
	void speedUp(int increment);
	
	void applyBrakes(int decrement);
}
