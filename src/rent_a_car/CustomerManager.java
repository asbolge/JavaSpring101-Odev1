package rent_a_car;

public class CustomerManager {
	
	private CustomerService customerService;

    public CustomerManager(CustomerService customerService) {
        this.customerService = customerService;
    }

    public void addNewCustomer(Customer customer) {
        customerService.addCustomer(customer);
    }


    public void showAllCustomers() {
        for (Customer customer : customerService.getAllCustomers()) {
            System.out.println(customer.getPhoneNumber());
        }
    }
}
