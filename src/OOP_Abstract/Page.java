package OOP_Abstract;

public abstract class Page {
	
	
	//can have both abstract and non abstract methods
	//can not create object of abstract method
	
	// abstract class constructor can be created
	// it will be called when we create object of child class
	
	
	
	
	public Page() {
		System.out.println("page default constructor --- launch app page");
	}
	
	
	public Page(int timeOut) {
		System.out.println("launch app within : "+ timeOut);
	}


	public abstract void header();
	public abstract void title();
	
	public void pageUrl() {
		System.out.println("http://www.abc.com");
	}
	

	public final void logo() {
		System.out.println("app logo");
	}
}
