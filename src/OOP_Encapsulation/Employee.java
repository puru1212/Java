package OOP_Encapsulation;

public class Employee {

	public String Name;
	private double salary;
	private double shares;

	public Employee(String name, double salary, double shares) {

		Name = name;
		this.salary = salary;
		this.shares = shares;

	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getShares() {
		return shares;
	}

	public void setShares(double shares) {
		this.shares = shares;
	}

}
