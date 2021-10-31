package BuilderPattern;

public class Shopping {

	public static void main(String[] args) {

		
		EcomApp ecom = new EcomApp();
		
		ecom.login("puru@gmail.co", "test123")
				.search("T-shirt", "Black")
					.addToCart("T-shirt")
						.doPayment("12121212", 1234)
							.getOrderInfo()
								.logout();
		
	}

}
