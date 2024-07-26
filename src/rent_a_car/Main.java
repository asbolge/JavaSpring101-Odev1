package rent_a_car;

public class Main {

	public static void main(String[] args) {
		
		İndividualCustomer sahan = new İndividualCustomer();
		sahan.setFirstName("sahan");
		sahan.setLastName("bölge");
		sahan.setPhoneNumber("01112223344");
		sahan.setId(0L);
		sahan.setNationalIdentity("2131232131");
		
		İndividualCustomer hilal = new İndividualCustomer();
		hilal.setFirstName("hilal");
		hilal.setLastName("bölge");
		hilal.setPhoneNumber("05556667788");
		hilal.setId(1L);
		hilal.setNationalIdentity("9768764343");
		
		CompanyCustomer microsoft = new CompanyCustomer();
		microsoft.setCompanyName("microsoft");
		microsoft.setId(2L);
		microsoft.setPhoneNumber("09998887766");
		microsoft.setTaxNumber("77777777");

		CustomerManager customerManager = new CustomerManager(new CustomerService());
		
		customerManager.addNewCustomer(sahan);
		customerManager.addNewCustomer(hilal);
		customerManager.addNewCustomer(microsoft);
		
		
		Sedan egea = new Sedan();
		egea.setBrand("fiat");
		egea.setModel("2018 egea");
		
		SUV egeaCross = new SUV();
		egeaCross.setBrand("fiat");
		egeaCross.setModel("2022 egea cross");
		
		Hatchbag fiesta = new Hatchbag();
		fiesta.setBrand("ford");
		fiesta.setModel("2016 fiesta");
		
		CarManager carManager = new CarManager(new CarService());
		
		carManager.addNewCar(egeaCross);
		carManager.addNewCar(egea);
		carManager.addNewCar(fiesta);
		
		RentalManager rentalManager = new RentalManager(new RentalService());
		
		carManager.showRentableCars(microsoft);
		
		System.out.println("hello world");
	}

}
