package The_Author_and_Book_Classes_Again;

public class Author {
	
	private String name, email;
	private char gender;
	
	Author(String name, String email, char gender){
		this.name = name;
		this.email = email;
		this.gender = gender;
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
	
	public char getGender() {
		return this.gender;
	}

	public String toString() {
		return String.format("Author[name=%s,email=%s,gender=%c]\n", name, email, gender);
	}
}
