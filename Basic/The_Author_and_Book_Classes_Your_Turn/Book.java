package The_Author_and_Book_Classes_Your_Turn;

public class Book {
	
	private String isbn, name;
	private Author author;
	private double price;
	private int qty = 0;
	
	Book(String isbn, String name, Author author, double price){
		this.isbn = isbn;
		this.name = name;
		this.author = author;
		this.price = price;
	}
	
	Book(String isbn, String name, Author author, double price, int qty){
		this.isbn = isbn;
		this.name = name;
		this.author = author;
		this.price = price;
		this.qty = qty;
	}
	
	public String getISBN() {
		return this.isbn;
	}
	
	public String getName() {
		return this.name;
	}
	
	public Author getAuthor() {
		return this.author;
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
	
	public String getAuthorName() {
		return author.getName();
	}
	
	public String toString() {
		return String.format("Book[isbn=%s,name=%s,%s],price=%.01f,qty=%d]", isbn, name, author, price, qty);
	}
}
