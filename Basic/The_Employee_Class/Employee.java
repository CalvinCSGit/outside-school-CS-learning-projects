package The_Employee_Class;

public class Employee {
	
	private int id, salary;
	private String firstName, lastName;
	
	Employee(int id, String firstName, String lastName, int salary){
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}
	
	public int getId() {
		return this.id;
	}
	
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public String getName() {
		return this.firstName + " " + this.lastName;
	}
	
	public int getSalary() {
		return this.salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public int getAnnualSalary() {
		return this.salary*12;
	}
	
	public int raiseSalary(int percent) {
		return this.salary += (this.salary*percent)/100;
	}
	
	public String toString() {
		return "Employee[id=" + this.id + ",name=" + this.getName() + ",salary=" + this.getSalary();
	}
}
