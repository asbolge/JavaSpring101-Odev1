package rent_a_car;

public class SUV extends Car{

	public SUV(String brand, String model, String transmissionType, long trunkCapacity, String color, long age,
            String fuelType, double dailyRentalPrice) {
		super(false, true, brand, model, "SUV", transmissionType, trunkCapacity, color, age, fuelType, dailyRentalPrice, 0);
	}
}
