package JavaSessions;

public class Car {

	String name;
	int price;
	String model;
	static int wheels = 4;
	
	public static void main(String[] args) {
		
		Car c1 = new Car();
		c1.name = "Audi";
		c1.model = "R-8";
		c1.price = 80;
				
		
		System.out.println(c1.name + " "+c1.model+ " "+c1.name+ " "+c1.wheels );
		System.out.println(c1.name + " "+c1.model+ " "+c1.name+ " "+Car.wheels);
		System.out.println(c1.name + " "+c1.model+ " "+c1.name+ " "+ wheels );

		// how to call static variable with static way:
		//1. call by class name
		//2. call directly
		//3. call by obj ref name: a warning will be given
		
		
		
	}

}
