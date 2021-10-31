package OOP_Abstract;

public class LoginPage extends Page {
	
	
	public LoginPage (){
		System.out.println("LP -- default const...");
	}

	public LoginPage (int timeOut){
		System.out.println("LP -- time out const..."+ timeOut);
	}
	
	@Override
	public void header() {
		System.out.println("LP -- header");
	}

	@Override
	public void title() {
		System.out.println("LP -- title");

	}

	public void forgetPassword() {
		System.out.println("LP -- forgert password");
	}
	public void doLogin(String username,  String password) {
		System.out.println("LP -- forgert password");
	}



}
