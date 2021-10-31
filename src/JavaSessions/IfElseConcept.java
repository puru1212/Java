package JavaSessions;

public class IfElseConcept {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;

		System.out.println(a == b);

		if (a == b) {
			System.out.println("both are equal");
		} else {
			System.out.println("both are diffrent");
		}

		if (true) {
			System.out.println("pass");
		} else { // dead code
			System.out.println("fail");
		}

		boolean flag = false;

		if (flag) {
			System.out.println("hi..");
		} else {
			System.out.println("bye..");
		}

		String s = "cypress";
		if (s.contentEquals("Selenium")) {
			System.out.println("i learn Selenium");
		}

		if (s.equals("cypress")) {
			System.out.println("i learn cypress");
		}

//		String browser = "chrome";
//		
//		if (browser.equals("chrome")) {
//			System.out.println("launch chrome");
//		}
//		if (browser.equals("firefox")) {
//			System.out.println("launch ff");
//		}
//		if (browser.equals("safari")) {
//			System.out.println("launch safari");
//		}
//		if (browser.equals("edge")) {
//			System.out.println("launch edge");
//		} else {
//			System.out.println("browser not found....");
//		}

//		String browser = "to";
//		
//		if (browser.equals("chrome")) {
//			System.out.println("launch chrome");
//		}else if(browser.equals("IE")) {
//			System.out.println("launch ie");
//		}else if(browser.equals("safari")) {
//			System.out.println("safari");
//		}else {
//			System.out.println("browser not found.....");
//		}

		System.out.println("-------------------------");
		// switch case

		String browser = "chrome";

		switch (browser) {
		case "chrome":
			System.out.println("launch chrome");
			break;
		case "safari":
			System.out.println("launch safari");
			break;
		case "ie":
			System.out.println("ie");
			break;

		default:
			System.out.println("please pass the correct browser name");
			break;
		}

		System.out.println("-------------------------");

		int marks = 19;

		switch (marks) {
		case 1:
			System.out.println("case 1");
			break;
		case 10:
			System.out.println("case 10");
			break;
		case 100:
			System.out.println("case 100");
			break;

		default:
			System.out.println("put correct numbers");
			break;
		}
		System.out.println("-------------------------");

		// >=90 -- Grade A,
		// 71 - 90 ---> grade B
		// 50 to 70--> grade C
		// less 50 -- Fail

		int m = 300;
		if (m <= 100) {
			if (m >= 90) {
				System.out.println("Grade A");
			}
			if (m <= 89) {
				if (m >= 71) {
					System.out.println("Grade B");
				}
				if (m <= 70) {
					if (m >= 51) {
						System.out.println("Grade C");
					}
					if (m <= 50) {
						System.out.println("Fail");
					}
				}
			}

		}

		System.out.println("-------------------------");
		
		
		//WAP to find out the highest number out of three diff numbers:
		
		
		int u = 700;
		int i = 500;
		int o = 400;
		
		if(u>i && u>0) {
			System.out.println("u is the highest number");
		}else if (i>o) {
			System.out.println("i is the highest number");
		}else {
			System.out.println("o is the highest number");
		}
		
		
		System.out.println("-------------------------");
		
		String s1 = "Linux";
		if(s1.equals("Win")||s1.equals("Mac")||s1.equals("Linux")) {
			System.out.println("OS is running in the system");
		}
		

		System.out.println("-------------------------");
		
		
		String user = "Ramesh";
		
		if (!user.equals("Admin")) {
			System.out.println("Login with Admin");
		}else {
			System.out.println("Login with normal user");
		}
		
		System.out.println("-------------------------");
		
		String text = "";
		
		System.out.println(text.isEmpty());
		System.out.println(text.isBlank());
		
		
		if(!text.isBlank()){
			System.out.println("text link is found");
		}
		
		System.out.println("-------------------------");
		int v1 = 'a'; //97
		int v2 = 'b'; //98
		
		System.out.println(v2);
		System.out.println(v1+v2);
		
		System.out.println('a'+'b');
		System.out.println('a'+""+'b');
		
		System.out.println(v1++);
		System.out.println(v1);
		
		int v = 2;
		System.out.println(v++ + ++v);
		
	}

}
