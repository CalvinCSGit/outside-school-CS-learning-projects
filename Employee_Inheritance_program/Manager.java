package Employee_Inheritance_program;

public class Manager extends Employee {

	String department;

	Manager(String name, int age, String phone, String address, double salary, String department) {
		super(name, age, phone, address, salary);
		this.department = department;
	}

	public void printSalary() {
		super.printSalary();
	}

}
