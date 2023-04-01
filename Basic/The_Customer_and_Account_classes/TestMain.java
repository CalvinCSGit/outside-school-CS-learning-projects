package The_Customer_and_Account_classes;

public class TestMain {
	public static void main(String args[]) {
		
		Customer c1 = new Customer(0, "Bob", 'm');
		System.out.println(c1);
		
		System.out.println("customer's ID is : " + c1.getID());
		System.out.println("customer's name is : " + c1.getName());
		System.out.println("customer's gender is : " + c1.getGender());
		
		Account a1 = new Account(0, c1, 0.0);
		System.out.println(a1);
		
		System.out.println("customer's account ID is : " + a1.getID());
		System.out.println("account's customer is : " + a1.getCustomer());
		System.out.println("customer's account balance is : " + a1.getBalance());
		a1.setBalance(999.99);
		System.out.println("customer's account balance is : " + a1.getBalance());
		System.out.println("customer's name is : " + a1.getCustomerName());
		a1.deposit(0.01);
		System.out.println("customer's account balance is : " + a1.getBalance());
		a1.withdraw(1000.01);
		a1.withdraw(1000.00);
		System.out.println("customer's account balance is : " + a1.getBalance());
	}

}
