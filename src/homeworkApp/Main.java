package homeworkApp;


public class Main {

	public static void main(String[] args) {
		Customer yigit = new Customer(1, "Yiðit", "Yeler", "18.10.2002", "12121212121");
		Customer burak = new Customer(0, "Burak", "Ýmdat", "18.10.2002", "12121212121");
		Customer ozan = new Customer(0, "Ozan", "Durgut", "18.10.2002", "12121212121");
		
		CustomerRegistration[] customerRegistrations = {
				new StarbucksRegistration(),
				new NeroRegistration(new MernisVerification(burak)),
		};
		
		CustomerManager customerManager = new CustomerManager(customerRegistrations);
		customerManager.addCustomer(yigit);
		customerManager.addCustomer(burak);
		
		NeroRegistration neroRegistration = new NeroRegistration(new MernisVerification(yigit));
		neroRegistration.BuyCoffee();
		NeroRegistration neroRegistration1 = new NeroRegistration(new MernisVerification(burak));
		neroRegistration1.BuyCoffee();
		NeroRegistration neroRegistration2 = new NeroRegistration(new MernisVerification(ozan));
		neroRegistration2.BuyCoffee();
		
		
		StarbucksRegistration StarbucksRegistration = new StarbucksRegistration();
		StarbucksRegistration.BuyCoffee();
	}

}
