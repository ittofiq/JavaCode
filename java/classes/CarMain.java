package classes;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car.Owner = "Smith";
		
		Car car = new Car("BMW", 2018, 10000, 5);
		
		double Price = car.getPrice();
		
		System.out.println("Car Owner : "+car.Owner);
		System.out.println("Car Type : "+car.Type);
		System.out.println("Car Price : "+Price);
		
		Car newCar = new Car();
		newCar.Type = "HONDA";
		newCar.Model = 2018;
		newCar.Price = 9000;
		newCar.milesDrive = 15;
		
		Price = newCar.getPrice();
		
		System.out.println("newCar Owner : "+newCar.Owner);
		System.out.println("newCar Type : "+newCar.Type);
		System.out.println("newCar Price : "+Price);
	}

}
