package rent_a_car;

public class Sedan extends Car {
    
	
	public Sedan(String brand, String model, String transmissionType, long trunkCapacity, String color, long age,
            String fuelType, double dailyRentalPrice, double monthlyDiscount) {
		super(true, true, brand, model, "Sedan", transmissionType, trunkCapacity, color, age, fuelType, dailyRentalPrice, monthlyDiscount);
	}
	
}
