package Assignments;



public class JavaAssignments1 {



	//Loops Assignment:

	public static void main(String[] args) {
//		1. WAP to print following output:
//			I am Batman
//
//			I am Batman
//
//			I am Batman
//
//			I am Batman
//
//			I am Batman		
		System.out.println("****************************");
		String s = "I am Batman";
		
		for(int k = 1; k<=5; k++ ) {
			System.out.println(s);
			
		}
		System.out.println("****************************");
//		2. WAP to print following output:
//			I am Batman 1
//
//			I am Batman 2
//
//			I am Batman 3
//
//			I am Batman 4
//
//			I am Batman 5
//
//			I am Batman 6
//
//			I am Batman 7
//
//			I am Batman 8
//
//			I am Batman 9

		System.out.println("****************************");
		for (int p = 1; p<=9; p++) {
			System.out.println(s+ " "+ p);
		}
		
		System.out.println("****************************");
		//3. WAP to print 10 to 1 using for, while and do-while loop
		
		System.out.println("******** using for loop***********");
		for (int l =10; l>0; l--) {
			System.out.println(l);
		}
		System.out.println("******** using while loop***********");
		int w = 10;
		while (w>0) {
			System.out.println(w);
			w--;
		}
		System.out.println("******** using do while loop***********");
		
		int h = 10;
		do {
			System.out.println(h);
			h--;
		} while(h>0);
		
		//4. Write a program in Java to print "Hello World" ten times using while loop
		System.out.println("****************************");
		String sr = "Hello World";
		int j= 10;
		while(j>0) {
			System.out.println(sr);
			j--;
		}
		System.out.println("****************************");
		//5. Write a program in Java to print 1 to 10 using while loop but quit if multiple of 7 is encountered
		
		
		System.out.println("****************************");

		
		int m = 1;
		while(m<=10) {
			System.out.println(m);
			m++;
			if(m%7==0) {
				break;
			}
		}
		System.out.println("****************************");
		
//		Data Types:
//			1. Write a Java program to print 'Hello' on screen and then print your name on a separate line.
//			Expected Output :
//			Hello 
//			Naveen K
		
		
		System.out.println("****************************");
		
		String name = "Puru";
		
		System.out.println("Hello\nPuru");
		System.out.println("****************************");
//		2. Write a Java program to print the sum of two numbers. 
//		Test Data: 
//		74 + 36 
//		Expected Output :
//		110
		
		
		System.out.println("****************************");
		int a = 74;
		int b = 36;
		
		System.out.println(a+b);
		
		System.out.println("****************************");
		
//		3. Write a Java program to divide two numbers and print on the screen. 
//		Test Data : 
//		50/3
//		Expected Output :
//		16
		System.out.println("****************************");
		int c = 50;
		int d= 3;
		
		System.out.println(c/d);
		System.out.println("****************************");
		
//		4. Write a Java program to print the result of the following operations. Change your test data accordingly.
//		Test Data:
//		a. -5 + 8 * 6
//		b. (55+9) % 9 
//		c. 20 + -3*5 / 8 
//		d. 5 + 15 / 3 * 2 - 8 % 3 
//		Expected Output :
//		43 
//		1 
//		19 
//		13

		System.out.println("****************************");
		
		int v = -5 + 8 * 6;
		int x = (55+9) % 9;
		int y =  20 + -3*5 / 8;
		int z = 5 + 15 / 3 * 2 - 8 % 3;
		
		
		System.out.println("Answer is as follows: " +"\n"+ v+"\n"+x+"\n"+y+"\n"+z);
		
		System.out.println("****************************");
		
//		5. Write a Java program to compute the specified expressions and print the output. Go to the editor
//		Test Data:
//		((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)) 
//		Expected Output
//		2.138888889
		System.out.println("****************************");
		
		
		System.out.println(((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)));
		System.out.println("****************************");
//		6. Try to concat "Hello Selenium" with a character 't'.

		String st= "Hello Selenium";
		char t = 't';
		System.out.println(st+t);
		System.out.println("****************************");
		
//		7. Create three int variables having values like : 100, 200, 3400. Add them and concatenate and generate this output String : 
//		"Your Toal amount is. 3700".
		int c1 = 100;
		int c2= 200;
		int c3 = 3400;
		
		System.out.println("Your Total amount is. "+ c1+c2+c3);
		System.out.println("****************************");
		
//		8. What should be the output for :

			byte b3 = 065;
			System.out.println(b3);
		
			System.out.println("This is example of Octal number");
		
		System.out.println("****************************");
//		1. Take three numbers from the user and print the greatest number. 
//
//		Test Data
//		Input the 1st number: 25 
//		Input the 2nd number: 78 
//		Input the 3rd number: 87
//		Expected Output :
//		The greatest: 87

		int t1 = 0;
		int t2 = 0;
		int t3 = 0;
		
		t1 = 25;
		t2 = 78;
		t3 = 87;
		
		if (t1>t2 && t1>t3) {
			System.out.println("the greatest: " + t1);
		}else if (t2>t3) {
			System.out.println("the greatest: " + t2);
		}else {
			System.out.println("the greatest: " + t3);
		}
		
	
		
		
		System.out.println("****************************");
		
		
//		2. Write a Java program to test a number is positive or negative.
//
//		Test Data
//		Input number: 35 -- positive number
//		Input number: -11 -- negative number
		System.out.println("****************************");
		
		
		
		int num = 0;

		
		if(num>0) {
			System.out.println(num + " is the positive number");
		}else if(num<0) {
			System.out.println(num + " is the negative number");
		}else {
			System.out.println(num + " is neither positive or negative");
		}
		
		
		
		
		
		
		System.out.println("****************************");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

	
	}

	private static void divide() {
		// TODO Auto-generated method stub
		
	}
}
