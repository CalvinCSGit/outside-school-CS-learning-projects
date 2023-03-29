package The_Customer_and_Invoice_classes;

public class Invoice {
	
	private int id;
	private Customer customer;
	private double amount;
	
	Invoice(int id, Customer customer, double amount){
		this.id = id;
		this.customer = customer;
		this.amount = amount;
	}
	
	public int getID() {
		return this.id;
	}
	
	public Customer getCustomer() {
		return this.customer;
	}
	
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	public double getAmount() {
		return this.amount;
	}
	
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public int getCustomerID() {
		return this.id;
	}
	
	public String getCustomerName() {
		return customer.getName();
	}
	
	public int getCustomerDiscount() {
		return customer.getDiscount();
	}
	
	public double getAmountAfterDiscount() {
		return this.amount-((this.amount*this.getCustomerDiscount())/100);
	}
	
	@Override
	public String toString() {
		return String.format("Invoice[id=%d,%s,amount=%.1f", id, customer, amount);
	}
	
}
