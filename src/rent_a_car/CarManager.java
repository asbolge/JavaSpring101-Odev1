package rent_a_car;

public class CarManager {

	
	private CarService carService;

    public CarManager(CarService carService) {
        this.carService = carService;
    }

    public void addNewCar(Car car) {
        carService.addCar(car);
    }


    public void showAllCars() {
        for (Car car : carService.getAllCars()) {
            System.out.println(car.getBrand() + " " + car.getModel());
        }
    }
    
    public void showRentableCars(Customer customer) {
        for (Car car : carService.getAllCars()) {
        	if(customer instanceof İndividualCustomer) {
        		if(car.getSegment().equals("Sedan")||car.getSegment().equals("Hatchbag")) {
        			System.out.println(car.getBrand() + " " + car.getModel());
        		}
        	}else {
        		System.out.println(car.getBrand() + " " + car.getModel());
        	}
        }
    }
    
    public void getCarInfo(Car car) {
    	System.out.println(carService.getCarInfo(car));
    }

}
