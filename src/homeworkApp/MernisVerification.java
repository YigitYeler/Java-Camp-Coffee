package homeworkApp;

public class MernisVerification implements Verification{
	private Customer customer;
	
	public MernisVerification(Customer customer) {
		this.customer = customer;
	}
	@Override
	public boolean Verify() {
		// TODO Auto-generated method stub
		if(customer.getId() == 0) {
			return true;
		}
		
		return false;
		
		
	}

}
