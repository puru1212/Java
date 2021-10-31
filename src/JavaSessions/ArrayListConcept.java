package JavaSessions;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListConcept {

	public static void main(String[] args) {

		ArrayList<Object> ar = new ArrayList<Object>();

		ar.add("Tom");
		ar.add('M');
		ar.add(24);
		ar.add(45.33);

		System.out.println(ar);
		System.out.println(ar.size());

		ar.add("Testing");
		ar.add("Selenium");
		System.out.println(ar);
		ar.add(1, "Dev");
		System.out.println(ar);

		// to print arraylist
		System.out.println("*****************************");
		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}

		System.out.println("*****************************");

		for (Object e : ar) {
			System.out.println(e);
		}

		System.out.println("*****************************");

		// Generic in ArrayList

		ArrayList<String> names = new ArrayList<String>();

		names.add("Puru");
		names.add("Naveen");
		names.add("Testing");

		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(23);
		marks.add(34);
		marks.add(55);

		ArrayList<Object> product = new ArrayList<Object>();

		product.add("MacBook Pro");
		product.add(4000);
		product.add('t');
		product.add("Neon Enterprise");
		product.add(4.5);

		for (Object e : product) {
			System.out.println(e);
			if (e.equals("Neon Enterprise")) {
				System.out.println("This sellor is good......");
			}
		}

		System.out.println("*******Scorecard*********");

		ArrayList<Integer> scoreList = new ArrayList<Integer>();
		scoreList.add(10);
		scoreList.add(1);
		scoreList.add(20);
		scoreList.add(5);
		scoreList.add(100);
		scoreList.add(30);

		System.out.println(scoreList);
		System.out.println(scoreList.get(0));
		System.out.println(scoreList.get(2));

		scoreList.add(0, 200);
		System.out.println(scoreList);
		Collections.sort(scoreList);
		System.out.println(scoreList);

		for (Integer e : scoreList) {
			System.out.println(e);
		}
		
		System.out.println("****************");
		System.out.println("****************");
		System.out.println("****************");
		System.out.println("****************");
		System.out.println("****************");
		System.out.println("****************");
		System.out.println("****************");
		System.out.println("****************");
		System.out.println("****************");
		System.out.println("****************");
		System.out.println("****************");
		
		scoreList.stream().forEach(e->System.out.println(e));
		

	}

}
