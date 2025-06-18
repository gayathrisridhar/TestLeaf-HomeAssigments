package week1.day3;

public class Library {
	// Understanding Methods and Objects in Java

	String addBook(String bookTitle){
		System.out.println("Book added successfully");
		return bookTitle;
	}
	
	void issueBook() {
		System.out.println("Book Issued Successfully");
	}
	
	public static void main(String[] args) {
		Library bookStatus = new Library();
		
		String book = bookStatus.addBook("How to Learn Selenium");
		System.out.println(book +" Book Issued");
		bookStatus.issueBook();

	}

}
