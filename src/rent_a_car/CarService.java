package rent_a_car;

import java.util.ArrayList;
import java.util.List;

public class CarService {
	
private List<Car> cars;
	
	public CarService() {
		cars = new ArrayList<>();
	}
	
	public void addCar(Car car) {
		cars.add(car);
	}
	
	public List<Car> getAllCars() {
		return cars;
	}
	
}
