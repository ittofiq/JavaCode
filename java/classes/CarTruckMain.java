package classes;

public class CarTruckMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car.Owner = "John";
		CarTruck carTruck = new CarTruck();
		carTruck.Type = "TOYOTA";
		carTruck.Model = 2018;
		carTruck.Price = 20000;
		carTruck.milesDrive = 5;
		carTruck.setHasTruck(true);
		
		double Price = carTruck.getPrice();
		
		System.out.println("Type : "+carTruck.Type);
		carTruck.setOwner();
		System.out.println("Price : "+Price);
	}

}
