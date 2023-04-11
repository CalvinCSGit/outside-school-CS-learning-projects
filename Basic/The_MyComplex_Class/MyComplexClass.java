package The_MyComplex_Class;

import java.util.ArrayList;
import java.util.Scanner;

public class MyComplexClass {
	
	private static ArrayList<Double> complexNumber = new ArrayList<Double>();
	private static String[] toConvert1 = new String[2];
	private static String[] toConvert2 = new String[2];
	
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		char userMenuInput = ' ';
		
		while(userMenuInput != 'e') {
			System.out.println("Choice menu.\n- (c) Create 2 new complex numbers\n- (e) Exit program");
			userMenuInput = scanner.next().charAt(0);
			if (userMenuInput == 'c') {
				System.out.println("Enter a complex number: ");
				scanner.nextLine();
				toConvert1 = scanner.nextLine().split(" ");
				System.out.println("Enter a 2nd complex number: ");
				toConvert2 = scanner.nextLine().split(" ");
				parseToDouble(toConvert1);
				MyComplex complex1 = new MyComplex(complexNumber.get(0), complexNumber.get(1));
				System.out.println("Complex number 1, real number: " + complex1.getReal());
				System.out.println("Complex number 1, imaginary number: " + complex1.getImag());
				System.out.println("Is Complex number 1, real number, real??: " + complex1.isReal());
				System.out.println("Is Complex number 1, imaginary number, imaginary??: " + complex1.isImaginary());
				System.out.println("The magnitude of complex number 1 is: " + complex1.magnitude());
				parseToDouble(toConvert2);
				MyComplex complex2 = new MyComplex(complexNumber.get(2), complexNumber.get(3));
				System.out.println("Complex number 2, real number : " + complex2.getReal());
				System.out.println("Complex number 2, imaginary numer : " + complex2.getImag());
				System.out.printf("Is Complex number 2, real number, real??: %s\n", complex2.isReal());
				System.out.printf("is Complex number 2, imaginary number, imaginaru??: %s\n", complex2.isImaginary());
				System.out.printf("The magnitude of complex number 2 is: %s\n", complex2.magnitude());
				System.out.println(complexNumber);
				System.out.printf("Is complex number 1 and complex number 2 equal?: %s\n", complex1.equals(complex2));
				System.out.println("Add complex number 2, into complex number 1 = " + complex1.addInto(complex2));
				System.out.printf("Complex number 1, added into complex number 2 and create a new complex number with the result is equal to = %s\n", complex2.addNew(complex1));
			} else if (userMenuInput == 'e') {
				break;
			} else {
				System.out.println("Please review the menu options.");
			}
		}
	}
	
	private static ArrayList<Double> parseToDouble(String[] toConvert) {
		for (int i = 0; i < toConvert.length; i++) {
			complexNumber.add(Double.parseDouble(toConvert[i]));
		}
		return complexNumber;
	}
}
