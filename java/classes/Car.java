package classes;

public class Car {

	String Type;
	int Model;
	double Price;
	double milesDrive;
	static String Owner;
	
	public Car(String carType, int carModel, double carPrice, double carMilesDrive) {
	
		this.Type = carType;
		this.Model = carModel;
		this.Price = carPrice;
		this.milesDrive = carMilesDrive;
		
		System.out.println("Constructor 1 is created");
	}
	
	public Car() {
		System.out.println("Constructor 2 is created");
	}
	
	double getPrice() {
		double newPrice = Price - (milesDrive * 100);
		return newPrice;
	}
}
