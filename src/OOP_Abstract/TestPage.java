package OOP_Abstract;

public class TestPage {
	
	public static void main (String arug []) {
		
		LoginPage lp = new LoginPage(10);
		
		lp.header();
		lp.title();
		lp.pageUrl();
		lp.logo();
		lp.doLogin("admin", "admin");
		lp.forgetPassword();
		
		//top casting
		
		Page p = new LoginPage();
		p.header();
		p.logo();
		p.pageUrl();
		
		
		//down casting is not possible
		
		
		
	}

}
