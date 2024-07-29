package rent_a_car;

public class Hatchbag extends Car{
	
	public Hatchbag(String brand, String model, String transmissionType, long trunkCapacity, String color, long age,
            String fuelType, double dailyRentalPrice, double monthlyDiscount) {
		super(true, true, brand, model, "Hatchbag", transmissionType, trunkCapacity, color, age, fuelType, dailyRentalPrice, monthlyDiscount);
	}
}
