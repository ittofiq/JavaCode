package classes;

public class CarTruck extends Car {

	private boolean hasTruck;
	
	public void setHasTruck(boolean hasTruck) {
		this.hasTruck = hasTruck;
	}
	
	public void setOwner() {
		System.out.println("Owner :"+Owner);
	}
	
	@Override
	public double getPrice() {
		double newPrice = Price - (milesDrive*50);
		return newPrice;
	}
}
