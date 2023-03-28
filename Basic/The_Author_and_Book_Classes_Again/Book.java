package The_Author_and_Book_Classes_Again;

public class Book {
	
	private String name;
	private Author authors[];
	private double price;
	private int qty = 0;
	
	Book(String name, Author[] authors, double price){
		this.name = name;
		this.authors = authors;
		this.price = price;
	}
	
	Book(String name, Author[] authors, double price, int qty){
		this.name = name;
		this.authors = authors;
		this.price = price;
		this.qty = qty;
	}
	
	public String getName() {
		return this.name;
	}
	
	public Author[] getAuthors() {
		return this.authors;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getQty() {
		return this.qty;
	}
	
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	@Override
	public String toString() {
	StringBuilder authorNames = new StringBuilder();
	for(Author eachAuthor : authors){
	authorNames.append(eachAuthor);
	}
	return String.format("Book[name=%s,authors={%s},price=$%.2f,qty=%d]",
	name, authorNames, price, qty);
	}
	
	public String getAuthorNames(){
		StringBuilder authorNames = new StringBuilder();
		for(Author eachAuthor : authors){
		authorNames.append(eachAuthor.getName()).append(", ");
		}
		return authorNames.toString();
	}
}
