package rent_a_car;

public class RentalManager {

	  private RentalService rentalService;

	    public RentalManager(RentalService rentalService) {
	        this.rentalService = rentalService;
	    }
	    
	    public void RentDaily(Customer customer, Car car) {
	    	boolean success = rentalService.rentCarDaily(customer, car);
	    	if(success) {
	    		System.out.println("Günlük kiralama işlemi başarıyla yapıldı.");
	    	}else {
	    		System.out.println("Günlük kiralama işlemi başarısız.");
	    	}
	    }
	    
	    public void RentMonthly(Customer customer, Car car) {
	    	boolean success = rentalService.rentCarMonthly(customer, car);
	    	if(success) {
	    		System.out.println("Aylık kiralama işlemi başarıyla yapıldı.");
	    	}else {
	    		System.out.println("Aylık kiralama işlemi başarısız.");
	    	}
	    }
	    
	    
//	    public void Renting(Customer customer,Car car) {
//	    	boolean success = rentalService.rentCar(customer, car);
//	    	if(success) {
//	    		System.out.println("Kiralama işlemi başarıyla yapıldı");
//	    	}else {
//	    		System.out.println("Kiralama işlemi başarısız");
//	    	}
//	    }
}
