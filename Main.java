package Employee_Inheritance_program;

public class Main {

	public static void main(String args[]) {
		Manager m = new Manager("he", 30, "613-565-9232", "this boulevarad 435", 87000, "Human Resources");
		Officer o = new Officer("he2", 27, "819-854-9097", "this street 145", 75000.5, "Investigations");
		m.printSalary();
		o.printSalary();
	}

}
