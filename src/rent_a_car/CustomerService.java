package rent_a_car;

import java.util.ArrayList;
import java.util.List;

public class CustomerService {
	
	private List<Customer> customers;
	
	public CustomerService() {
		customers = new ArrayList<>();
	}
	
	public void addCustomer(Customer customer) {
		customers.add(customer);
	}
	
	public List<Customer> getAllCustomers() {
		return customers;
	}

}
