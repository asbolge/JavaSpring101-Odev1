package rent_a_car;

public class RentalService {

	public boolean canRentCar(Customer customer,Car car) {
		if(customer instanceof İndividualCustomer) {
			return car.getSegment().equals("Sedan") || car.getSegment().equals("Hatchbag");
		}
		return true;
	}
	
	
	
	public boolean rentCar(Customer customer,Car car) {
		
		if(canRentCar(customer,car)) {
			System.out.println(customer.getPhoneNumber() + " telefon numarasına sahip müşteri " + car.getBrand() +" "+ car.getModel() +" aracı kiraladı");
			return true;
		}else {
            System.out.println("Customer " + customer.getPhoneNumber() + " cannot rent this car.");
            return false;
		}
	}
}
