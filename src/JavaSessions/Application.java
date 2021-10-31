package JavaSessions;

public class Application {
	
	// Method Overloading:
	// within the same class with 
	//1. Same name
	//2. Different parameters
	//3.Different sequence of parameter
	
	// it is also called as compile time polymorphism because compiler is taking decision which method 
	//to call based on the arguments
	
	// polymorphism = (poly + morphism) poly-> many and orphism -> forms = manyforms/diffrentforms == samemethod with diff forms
	
	// diff between parameter and argument
	// public void test(int a , int b) // before passing actual values a &b are called parameters 
	// and after passing values (eg int 10 & 20) they are called arguments
	
	// can we overload the main method? ans= yes.
	// why main method is static in nature: ans- JVM can call it directly. main method is also stored in CMA/metaspace
	
	
	public void test() {

	}

	public void test(int a) {

	}

	public void test(String a) {

	}

	public void test(int a , int b) {

	}
	public void test(int a , String  b) {

	}

	public static void main(String[] args) {
		Application obj = new Application();
		obj.test();
		
		

	}

}
