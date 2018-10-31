package classes;

public class CarTruck extends Car {

	private boolean hasTruck;
	
	public CarTruck() {
		super("BMW", 2016, 10000, 5);
		System.out.println("Constructor of CarTruck");
	}
	
	public void setHasTruck(boolean hasTruck) {
		this.hasTruck = hasTruck;
	}
	
	public void setOwner() {
		System.out.println("CarTruck Owner : "+Owner);
	}
	
	@Override
	public double getPrice() {
		double newPrice = Price - (milesDrive*50);
		return newPrice;
	}
	
	public void getSuper() {
		System.out.println("Car Type : "+super.Type);
		System.out.println("Car Model : "+super.Model);
		System.out.println("Car Type : "+Owner);
		System.out.println("Car Price : "+super.getPrice());
	}
}
