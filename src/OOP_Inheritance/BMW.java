package OOP_Inheritance;

public class BMW extends Car{
	
	@Override
	public void start() {
		System.out.println("BMW -- start");
	}
	
	public void autoParking() {
		System.out.println("BMW -- autoparking");
	}
	
	
	public static void testing() {
		System.out.println("BMW -- testing");
	}
	
	@Override
	public void airBags() {
		System.out.println("BMW -- aribags");
	}


}
