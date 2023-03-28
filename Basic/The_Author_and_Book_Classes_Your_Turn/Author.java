package The_Author_and_Book_Classes_Your_Turn;

public class Author {
	
	private String name, email;
	
	Author(String name, String email){
		this.name = name;
		this.email = email;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String toString() {
		return String.format("Author[name=%s,email=%s]", name,email);
	}
}
