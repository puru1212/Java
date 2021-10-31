package JavaSessions;

public class FunctionsInJava {
	
	
	//functions - are also calss data members
	// can not create function inside a function
	// functon can not be duplicate
	// to call the function we need to create the object
	
	//3 types of function
	
	//1.  no input no return
	// void no return from function
	// return type = void
	
	public void test() { // 0 input paa
		System.out.println("test method....");
	}

	
	//2. no input some return
	//return type = String 
	
	public String getTrainerName () {
		System.out.println("getting trainer name...");
		String str = "Naveen";
		return str;
	}
	
	public int getPopulationCount() {
		
		System.out.println("get the population count....");
		int india = 100;
		int US = 50;
		int finalCount = india + US;
		return finalCount;
				
		
	}
	
	//3. some input some return:
	//return type = int
	public int add(int a, int b) {
		System.out.println("add method...");
		int z = a +b;
		return z;
		
		
	}
	
	//WAP where we have to pass student name (String)
	// return student marks (int)
	
	public int getStudentMarks(String name) {
		System.out.println("getting stdent marks for :" + name);
		
		int marks = -1;
		
		if (name.equals("Sachin")) {
			marks = 80;
		}
		else if (name.equals("Tom")) {
			marks = 85;			
		}
		else if (name.equals("Naveen")) {
			marks = 95;
		}
		else if (name.equals("Lita")) {
			marks = 75;
		}
		else if(name.equals("Puru")) {
			marks = 100;
		}
		else {
			System.out.println("Student name: " + name+ " is not found...");
		}
		
		
		if (marks==100) {
			System.out.println(name +" is the topper of the class");
		}
		else if (marks<90 && marks>70) {
			System.out.println(name + " needs to improve the performance");
		}
		
		return marks;
	}
	
	
	public static void main(String[] args) {
		
		FunctionsInJava obj = new FunctionsInJava();
		obj.test();
		String n = obj.getTrainerName();
		System.out.println(n);

		System.out.println(obj.getTrainerName());
		
		int popCount = obj.getPopulationCount();
		System.out.println(popCount);
		
		
		
		int sum = obj.add(10, 20);
		System.out.println(sum);
		System.out.println("_________________________________________");
		
		int m1= obj.getStudentMarks("Nancy");
		if(m1==-1) {
			System.out.println("This student is not in our school");
		}
		
		System.out.println(m1);	
		System.out.println("_________________________________________");
		String mesg = obj.launchBrowser("safari");
		System.out.println(mesg);
		System.out.println("_________________________________________");
		
		
		String newBrowserNme = obj.launchBrownerNew("IE");
		System.out.println(newBrowserNme);
		
	}
	
	
	// WAP- where i need to pass the browserName (String)
	// return the same browserName with mesg : " browserName is launched"
	
	
	public String  launchBrowser(String browserName) {
		System.out.println("browser name is : "+ browserName);
		
		
		switch (browserName) {
		case "Chrome":
			return browserName + " is launched successfully";
		case "fireFox":
			return browserName + " is launched successfully";
		case "IE":
			return browserName + " is launched successfully";
		case "safari":
			return browserName + " is launched successfully";
		case "Edge":
			return browserName + " is launched successfully";	
		
		default:
			System.out.println("Please pass the correct browser name");
			return "BROWSERNAMENOTFOUND --- 404 ERROR";
		}
		
	}
	
	
	
	public String launchBrownerNew(String browserNameNew) {
		System.out.println("Browser to be launched is : " + browserNameNew);
		
		if(browserNameNew.equals("Chrome")) {
			return browserNameNew +" is launched successfully";
		}
		else if(browserNameNew.equals("Safari")) {
			return browserNameNew +" is launched successfully";
		}
		else if(browserNameNew.equals("Edge")) {
			return browserNameNew +" is launched successfully";
		}
		else {
			System.out.println("Please pass the correct new browser name");
			return "NEWBROWSERNAMENOTFOUND --- 404 ERROR";
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
