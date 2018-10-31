package classes;

public class Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarTruck carTruck = new CarTruck();
		carTruck.Type = "Mazda";
		carTruck.Model = 2017;
		carTruck.Price = 30000;
		carTruck.milesDrive = 10;
		
		Car myCar = (Car) carTruck;
		
		System.out.println("My Car Price : "+myCar.getPrice());
	}

}
