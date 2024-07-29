package rent_a_car;

public class RentalService {

	public boolean canRentCar(Customer customer,Car car) {
		if(customer instanceof İndividualCustomer) {
			return car.getSegment().equals("Sedan") || car.getSegment().equals("Hatchbag");
		}
		return true;
	}
	public boolean rentCarDaily(Customer customer,Car car) {
			
			if(canRentCar(customer,car) && car.getIsDailyRentable()) {
				System.out.println(customer.getName() + " " + car.getBrand() +" "+ car.getModel() +" aracı 1 günlük  kiraladı");
				return true;
			}else {
	            System.out.println(customer.getName() + " bu aracı günlük olarak kiralayamaz.");
	            return false;
			}
		}
	
	public boolean rentCarMonthly(Customer customer,Car car) {
		
		if(canRentCar(customer,car) && car.getIsMonthlyRentable()) {
			System.out.println(customer.getName() + " " + car.getBrand() +" "+ car.getModel() +" aracı 1 ay kiraladı");
			return true;
		}else {
            System.out.println(customer.getName() + " bu aracı aylık olarak kiralayamaz.");
            return false;
		}
	}
}
