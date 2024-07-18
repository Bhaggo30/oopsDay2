package books.manage;

import java.awt.print.Book;
import java.util.List;

public class Liabrary_impl implements Library {
	private List<Book> books;
	private List<Author> author;
	

	public Liabrary_impl(List<Book> books, List<Author> author) {
		super();
		this.books = books;
		this.author = author;
	}

	@Override
	public void add(Book books) {
		
		
		
	}

	@Override
	public void remove(Book books) {
		
		
	}

	@Override
	public int getTotalBooks() {
		
		return 0;
	}

}
