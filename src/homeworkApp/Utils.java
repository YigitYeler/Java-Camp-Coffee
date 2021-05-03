package homeworkApp;

public class Utils {
	public static void runRegister(CustomerRegistration[] customerRegistrations , String massage) {
		for(CustomerRegistration customerRegistration : customerRegistrations) {
			customerRegistration.Register(massage);
		}
	}
}
