package classes;

public class CarTruckMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car.Owner = "John";
		CarTruck carTruck = new CarTruck();
		carTruck.getSuper();
		
		carTruck.Type = "TOYOTA";
		carTruck.Owner = "Kopral";
		carTruck.Model = 2018;
		carTruck.Price = 20000;
		carTruck.milesDrive = 5;
		carTruck.setHasTruck(true);
		
		double Price = carTruck.getPrice();
		
		System.out.println("CarTruck Type : "+carTruck.Type);
		System.out.println("CarTruck Model : "+carTruck.Model);
		carTruck.setOwner();
		System.out.println("CarTruck Price : "+Price);
	}

}
