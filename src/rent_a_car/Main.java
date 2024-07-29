package rent_a_car;

public class Main {

	public static void main(String[] args) {
		
		İndividualCustomer sahan = new İndividualCustomer("ahmet şahan", "bölge", 0, "01231234455", "31232131231");
		CompanyCustomer microsoft = new CompanyCustomer("microsoft", "13212131", 1L, "8746378634");
		
		CustomerManager customerManager = new CustomerManager(new CustomerService());
		
		customerManager.addNewCustomer(sahan);
		customerManager.addNewCustomer(microsoft);
		
		
		Sedan egea = new Sedan("fiat", "2018 egea", "manuel", 0, "mavi", 0, "dizel", 20, 10);
		Sedan civic = new Sedan("honda", "1999 civic", "manuel", 0, "gri", 0, "benzin&lpg", 5, 10);
		
		SUV egeaCross = new SUV("fiat", "2023 egea cross", "otomatik", 0, "kırmızı", 0, "benzin", 50);
		SUV qasqai = new SUV("nissan", " 2015 qasqai", "otomatik", 0, "beyaz", 0, "dizel", 80);
		
		Hatchbag fiesta = new Hatchbag("ford", "fiesta", "manuel", 0, "gri", 0, "lpg", 30, 12);
		
		CarManager carManager = new CarManager(new CarService());
		
		carManager.addNewCar(egeaCross);
		carManager.addNewCar(egea);
		carManager.addNewCar(fiesta);
		carManager.addNewCar(qasqai);
		carManager.addNewCar(civic);
		
		RentalManager rentalManager = new RentalManager(new RentalService());
		
		carManager.showRentableCars(microsoft);
		carManager.getCarInfo(fiesta);
		rentalManager.RentMonthly(microsoft, fiesta);
		
	}

}
