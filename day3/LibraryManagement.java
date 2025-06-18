package week1.day3;

public class LibraryManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library bookManagement = new Library();
		
		String book_1 = bookManagement.addBook("JAVA Principles");
		System.out.println(book_1);
		bookManagement.issueBook();
	}

}
