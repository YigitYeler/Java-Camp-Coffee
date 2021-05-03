package homeworkApp;

public class CustomerManager {
	private CustomerRegistration[] customerRegistrations;
	
	public CustomerManager(CustomerRegistration[] customerRegistrations) {
		this.customerRegistrations = customerRegistrations;
	}

	public void addCustomer(Customer customer) {
		Utils.runRegister(customerRegistrations , customer.getFirstName());
	}
	
	
}
