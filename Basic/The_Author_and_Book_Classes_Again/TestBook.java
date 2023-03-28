package The_Author_and_Book_Classes_Again;

public class TestBook {
	public static void main (String args[]) {
		Author[] authors = new Author[2];
		authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
		authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');
		//declare and allocate a Book_2 instance
		Book javaDummy = new Book("Java For Dummy", authors, 19.99, 99);
		System.out.println(javaDummy);
	}

}
