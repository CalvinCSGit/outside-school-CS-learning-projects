package The_Customer_and_Invoice_classes;

public class Customer {
	
	private int id, discount;
	private String name;
	
	Customer(int id, String name, int discount){
		if (discount >= 0 && discount <= 100) {
			this.id = id;
			this.name = name;
			this.discount = discount;
		} else {
		throw new IllegalArgumentException("Discount range [0,100]");
		}
	}
	
	public int getID() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getDiscount() {
		return this.discount;
	}
	
	public void setDiscount(int discount) {
		if (discount >= 0 && discount <= 100) {
			this.discount = discount;
		}else {
			System.out.println("Discount range is [0,100]");
		}
	}
	
	public String toString() {
		return String.format("%s(%d)(%d%%)", name, id, discount);
	}
}
