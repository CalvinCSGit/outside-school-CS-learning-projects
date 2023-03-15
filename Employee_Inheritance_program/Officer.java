package Employee_Inheritance_program;
import java.io.*;
import java.util.*;

public class Officer extends Employee {

	private String specialization;

	Officer(String name, int age, String phone, String address, double salary, String specialization) {
		super(name, age, phone, address, salary);
		System.out.print("Officer constructor called.");
		this.specialization = specialization;
	}

	public void printSalary() {
		super.printSalary();
	}
}
