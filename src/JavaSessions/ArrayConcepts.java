package JavaSessions;

public class ArrayConcepts {

	public static void main(String[] args) {

		int i[] = new int[3];
		
		i[0] = 30;
		i[1] = 40;
		i[2] = 50;
		
		//Array: collection of multiple elements (similar types)
		//two limitations: 
		//1. static array: size is fixed...to overcome this problem we use dynamic arrays (ArrayList)
		//2. it stores only similar types of values: to overcome this problem we user Object Array (static)
		
		//Lower index = 0
		// higher index = 2
		
		System.out.println(i[1]);
		System.out.println(i.length);
		
		System.out.println("*-------------*");
		
		for (int k = 0; k<i.length;k++) {
			System.out.println(i[k]);
			}
		
		System.out.println("*-------------*");
		for(int e :i) {
			System.out.println(e);
			
		}
		
		double d[] = new double[2];
		
		d[0] = 12.22;
		d[1] = 23.33;
		
		System.out.println(d[0]+d[1]);
		
		char c[] = new char[3];
		
		c[0] = 'T';
		c[1] = 'O';
		c[2] = 'M';
		
		char c1[] = new char[3];
		
		char[] c2 = c.clone();
		
		System.out.println(c2.length);
		
		for (char e: c2) {
			System.out.println(e);
			
		}
		
		System.out.println("*********************");
		
		//requirement : to store emp info: String, int, double, char, boolean
		//Object Array: static array:
	
		Object ob[] = new Object[5];
		
		ob[0] = "Tom";
		ob[1] = 'A';
		ob[2] = 23;
		ob[3] = 12.22;
		ob[4] = true;
		
		for(Object e : ob) {
			System.out.println(e);
		}
		
		
		System.out.println("*********************");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
