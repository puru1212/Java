package OOP_Encapsulation;

public class TestEmployee {

	public static void main(String[] args) {

		
		Employee e1 = new Employee("Tom", 12.33, 20);
		
		
		System.out.println("Name is : " + e1.getName() +" &"+" Salary is : " +e1.getSalary());
		
	}

}
