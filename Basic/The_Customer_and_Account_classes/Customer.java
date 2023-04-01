package The_Customer_and_Account_classes;

public class Customer {
	
	private int ID;
	private String name;
	private char gender;
	
	Customer(int ID, String name, char gender) {
		this.ID = ID;
		this.name = name;
		this.gender = gender;
	}
	
	public int getID() {
		return this.ID;
	}
	
	public String getName() {
		return this.name;
	}
	
	public char getGender() {
		return this.gender;
	}
	
	@Override
	public String toString() {
		return String.format("%s(%d)", name, ID);
	}

}
