package JavaSessions;

public class Persons {
	
	
	String name;
	int age;
	String city;
	
	//Constructor:
	//name should be same as class name
	//its not a function but looks like a function
	//it can not return any value
	//overloading is possible
	//it will be called when we create an object of the same class
	
	
	public void getInfo() {
		System.out.println("get info");
	}

	public Persons() {
		System.out.println("default constructor");
	}

	public Persons(String name, int age) {
		
		
		System.out.println("2 para constructor");
		this.name = name;
		this.age = age;
	}

	public Persons(String name, int age, String city) {

		System.out.println("3 para constructor");
		this.name = name;
		this.age = age;
		this.city = city;
	}
	

}
