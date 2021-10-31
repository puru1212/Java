package OOP_Encapsulation;

public class Browser {

	// private methods
	// will be accessed via public methods
	
	
	
	

	public void launchBrowser() {
		System.out.println("trying to launch the browser.....");
		isChromePresent();
		checkRAMSpace();
		browserIsUpgraded();
		checkOSCompatible();
		checkBrowserVersion();
		isAntiVirusPresent();
		System.out.println("browser is launched....");
		
	}

	private void isChromePresent() {
		System.out.println("isChromePresent method");

	}

	private void checkRAMSpace() {
		System.out.println("checkRAMSpace method");

	}
	private void browserIsUpgraded() {
		System.out.println("browserIsUpgraded method");

	}
	private void checkOSCompatible() {
		System.out.println("checkOSCompatible method");

	}
	private void checkBrowserVersion() {
		System.out.println("checkBrowserVersion method");

	}
	private void isAntiVirusPresent() {
		System.out.println("isAntiVirusPresent method");

	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
