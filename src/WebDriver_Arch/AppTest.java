package WebDriver_Arch;

public class AppTest {

	public static void main(String[] args) {

		WebDriver driver = null;

		String browser = "safari";

		if (browser.equals("Chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equals("fireFox")) {
			driver = new FireFoxDriver();
		} else if (browser.equals("safari")) {
			driver = new SafariDriver();
		} else {
			System.out.println("no browser is found");
		}

		driver.get("https://xyz.com");
		String title = driver.getTitle();
		System.out.println(title);

	}

}
