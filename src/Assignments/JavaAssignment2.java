package Assignments;

import java.util.Arrays;

public class JavaAssignment2 {

	public static void main(String[] args) {

		
//		Loop Assignment:
//			Question 1: Write a program to print the following pattern using for loop:
//
//			00 01 02 03 04 05 06 07 08 09 
//			10 11 12 13 14 15 16 17 18 19 
//			20 21 22 23 24 25 26 27 28 29 
//			30 31 32 33 34 35 36 37 38 39 
		
		
		
	
		for (int i = 0; i<=3; i++) {
			for(int k = 0; k<=9; k++) {
				System.out.print(i+""+k+" ");
			}
			System.out.println();
		}
		
		
		
		System.out.println("*------------------------------*");

//		Array Assignment:
//			Question 2: Write a program to create a static Array, having following cricket data:
//			--name(String), age(age), team name(String), DOB(String), gender(char), Strike Rate(Double), isActive(boolean)
//			--Try to create multiple Object Arrays for different players 
//			--Try to print all the values of each player on the console using normal for/while loop and for each loop


		
		Object ob[] = new Object[8];
		
		ob[0] = "Puru";
		ob[1] = "Tom";
		ob[2] = 32;
		ob[3] = "Testing Team";
		ob[4] = "09-08-1988";
		ob[5] = 'M';
		ob[6] = 56.78;
		ob[7] = true;
		
		
		System.out.println(ob.length);
		
		
		for (int o = 0; o<ob.length; o++) {
			System.out.println(ob[o]);
		}
		
		for (Object e : ob) {
			System.out.println(e);
		}
		
		System.out.println("***************");
		
		System.out.println(Arrays.toString(ob));
		
		
		
		
		
	}

}
