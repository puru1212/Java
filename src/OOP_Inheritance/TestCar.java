package OOP_Inheritance;

public class TestCar {

	public static void main(String[] args) {

		/**
		 * BMW -- start
			Car -- stop
			Car -- refule
			BMW -- autoparking
			vehicle -- engine
			BMW -- aribags
			BMW -- testing
			Car -- testing
			Car -- start
			Car -- stop
			Car -- refule
			BMW -- start
			Car -- stop
			Car -- refule
			BMW -- aribags
			vehicle -- engine

		 */
		
		BMW b = new BMW();
		
		b.start(); // Overridden
		b.stop(); // inherited from parents
		b.refule(); // inherited
		b.autoParking(); // individual 
		b.engine(); // inherited from grand parents
		b.airBags();
		System.out.println("_______________");
		System.out.println("***************************");
		BMW.testing();
		
		//method hiding
		BMW.testing();
		Car.testing();
		
		Car c = new Car();
		c.start();
		c.stop();
		c.refule();
		
		//top casting/up casting
		//child class object can be referred by parent class reference variable
		
		Car c1 = new BMW();
		
		c1.start();
		c1.stop();
		c1.refule();
		
		Vehicle v = new BMW();
		v.airBags();
		v.engine();
		
		//down casting 
		//we never use casting. no practical use case.
		//BMW b1 = (BMW)new Car(); // class cast exception at run time
		
		
	}

}
