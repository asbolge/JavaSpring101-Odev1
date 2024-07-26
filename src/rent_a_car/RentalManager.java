package rent_a_car;

public class RentalManager {

	  private RentalService rentalService;

	    public RentalManager(RentalService rentalService) {
	        this.rentalService = rentalService;
	    }
	    
	    public void Renting(Customer customer,Car car) {
	    	boolean success = rentalService.rentCar(customer, car);
	    	if(success) {
	    		System.out.println("Kiralama işlemi başarıyla yapıldı");
	    	}else {
	    		System.out.println("Kiralama işlemi başarısız");
	    	}
	    }
}
