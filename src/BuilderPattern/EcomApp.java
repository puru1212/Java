package BuilderPattern;

public class EcomApp {
	
	
	
	public EcomApp login(String Username, String psw) {
		System.out.println("Login with : "+ Username+ " "+ psw);
		return this;
	}
	public EcomApp search() {
		System.out.println("Search the product");
		return this;
		
	}
	public EcomApp search(String productName) {
		System.out.println("Search the product: "+productName);
		return this;
		
	}
	public EcomApp search(String productName, String color) {
		System.out.println("Search the product: "+productName + "Color : "+ color);
		return this;
		
	}
	public EcomApp addToCart(String productName) {
		System.out.println("adding the product to cart: "+ productName);
		return this;
		
	}
	public EcomApp doPayment(String CC, int otp) {
		System.out.println("payment with : "+ CC+ " "+ otp);
		return this;
		
	}
	public EcomApp getOrderInfo() {
		System.out.println("display the order details...");
		return this;
		
	}
	public EcomApp logout() {
		System.out.println("logout from the application");
		return this;
		
	}
	
	

}
