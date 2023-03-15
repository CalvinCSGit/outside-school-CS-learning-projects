package Employee_Inheritance_program;
import java.io.*;
import java.util.*;
import java.lang.*;

public class Employee {

	private String name, phone, address;
	private int age;
	private double salary;

	Employee(String name, int age, String phone, String address, double salary) {
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.address = address;
		this.salary = salary;
	}

	public void printSalary() {
		System.out.print(this.salary);
	}

}
