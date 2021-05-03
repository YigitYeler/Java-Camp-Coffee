package homeworkApp;

public class StarbucksRegistration implements CustomerRegistration{

	@Override
	public void Register(String massage) {
		System.out.println("Starbucksa kaydedildi : " + massage);
		
	}
	
	public void BuyCoffee() {
		BuyCoffeeS buyCoffeeS= new BuyCoffeeS();
		buyCoffeeS.buyCoffee();
	}

}
