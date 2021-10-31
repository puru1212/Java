package JavaSessions;

public class CarBooking {

	
	String carType;
	String from;
	String to;
	int code;
	
	
	
	public void Booking() {
		System.out.println("Car is booked with : "+ carType + " "+ from +" "+ to +" "+ code);
	}
	
	
	
	
	public CarBooking(String carType, String from, String to, int code) {
	
		this.carType = carType;
		this.from = from;
		this.to = to;
		this.code = code;
	}




	public CarBooking(String carType, int code) {
		super();
		this.carType = carType;
		this.code = code;
	}




	public CarBooking(String carType, String from, String to) {
		super();
		this.carType = carType;
		this.from = from;
		this.to = to;
	}
	
	
	
	
	
}
