package books.manage;

import java.awt.print.Book;

public interface Library {
	void add(Book books);
	void remove(Book books);
	int getTotalBooks();
	default void displayBooks() {
		System.out.println("display total number of books "+getTotalBooks());
	}
	
	
	

}
