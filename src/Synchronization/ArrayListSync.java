package Synchronization;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayListSync {

	public static void main(String[] args) {

		List<String> ls = new ArrayList<String>(Arrays.asList("java", "c#", "python", "php", "ruby"));
		System.out.println(ls);
		Collections.synchronizedList(ls);
		System.out.println(ls);
		
		synchronized (ls) {
			Iterator<String> it = ls.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
		}
		ls.stream().forEach(k->System.out.println(k));

		
		//2. 
		
		CopyOnWriteArrayList<String> lanList = new CopyOnWriteArrayList<String>();
		
		lanList.addAll(ls);
		System.out.println(lanList);
		
		
		
		
	}

}
