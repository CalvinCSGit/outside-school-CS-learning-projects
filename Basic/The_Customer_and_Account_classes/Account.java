package The_Customer_and_Account_classes;

public class Account {
	private int id;
	private Customer customer;
	private double balance = 0.0;
	
	Account(int id, Customer customer, double balance){
		this.id = id;
		this.customer = customer;
		this.balance = balance;
	}
	
	Account(int id, Customer customer){
		this.id = id;
		this.customer = customer;
	}
	
	public int getID() {
		return this.id;
	}
	
	public Customer getCustomer() {
		return this.customer;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public String toString() {
		return String.format("%s balance=$%.2f", customer, this.balance);
	}
	
	public String getCustomerName() {
		return this.customer.getName();
	}
	
	public Account deposit(double amount) {
		this.balance += amount;
		return this;
	}
	
	public Account withdraw(double amount) {
		if (this.balance >= amount) {
			this.balance -= amount;
		} else {
			System.out.println("amount withdrawn exceeds the current balance!");
		}
		return this;
	}

}
