package JavaSessions;

public class LoopConcept {

	public static void main(String[] args) {

		// 1 to 10
		// while loop

		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			// i++;
			// ++i;
			i = i + 1;

		}

		// while loop: we use it when we are not sure how many iterations are there.

		// practical use case:
		// 1. we have to lazy loading..linkedin, FB scrolling
		// 2. timeout operations: waiting for a webelement
		// 3. handing multiple windows: window handler APIs: how many pop ups?

		int n = 1;
		while (n <= 50) {
			System.out.println(n);
			if (n % 5 == 0) {
				System.out.println("Divisible by 5");
			}
			n++;
		}

		System.out.println("*********while with break******************");

		int num = 0;

		while (num <= 100) {
			System.out.println(num);
			if (num == 50) {
				System.out.println("Hey... Half Century");
			}
			if (num == 100) {
				System.out.println("Hey... Century");
			}
			if (num == 0) {
				System.out.println("duck.... out");
				break;
			}

			num++;
		}

		System.out.println("------------------------------------------");

		// ***************************for loop 1 : 10

		for (int p = 1; p <= 10; p++) {
			System.out.println(p);
		}

		// continue loop

//		for (;;) {
//			System.out.println("** Bye...... **");
//		}

		System.out.println("------------------------------------------");

		for (int even = 0; even <= 10; even = even + 2) {
			System.out.println(even);

		}
		System.out.println("------------------------------------------");
		for (int evnum = 0; evnum <= 10; evnum++) {
			if (evnum % 2 == 0) {
				System.out.println("even number is : " + evnum);
//			} else {
//				System.out.println("odd number is : " + evnum);
//			}

		}
		}
		System.out.println("------------------------------------------");

		for (int odnum = 0; odnum<= 10; odnum++) {
			if (odnum% 2 != 0) {
				System.out.println("odd number is : " + odnum);
			}

		}

		
		//for loop: we use it when we are sure about how many iterations we need to perform
		
		// use cases;
		//1. you have to iterate array, arraylist, collections which order based
		//2. total links on the page: you have to print the text of all links
		//3. footer/top links
		//4. ArrayList -- 10 links---> 
		//click on product link: if(text.quals("product") --> click and break
		System.out.println("------------------------------------------");

		int u = 1;
		for(;u<=10;u++) {
			System.out.println(u);
			if (u==7) {
				System.out.println("Hello....");
			}
		}
		
		
		// infinite loop case
		///Taj Hotel--display--welcome to taj -- 24x7:
		
//		while(true) {
//			System.out.println("welcome to teaj...");
//			
//		}
//		while(true) {
//		check the element is displayed or not...
//		once its displayed -- break the loop
//		thread.sleep(2);
//		max time out = 20 secs --break;
		
		
		//do-while loop:
			//webelement--> at least check this webelement on the page immediately...
			//if first time its available on the page....break the loop
			
			//land on the web page:
			//check if page is fully loaded...do loop
			//then WE ---while();
		
		System.out.println("------------------------------------------");
		int h = 1;
		do {
			System.out.println(h);
			h++;
		} while(h>=10);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
