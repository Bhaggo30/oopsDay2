package books.manage;

import java.awt.print.Book;
import java.time.LocalDate;
import java.util.List;

public class Author {
	private String Aname;
	private LocalDate birthdate;
	private List <Book> writtenBooks;
	public Author(String aname, LocalDate birthdate, List<Book> writtenBooks) {
		super();
		Aname = aname;
		this.birthdate = birthdate;
		this.writtenBooks = writtenBooks;
	}
	public String getAname() {
		return Aname;
	}
	public void setAname(String aname) {
		Aname = aname;
	}
	public LocalDate getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(LocalDate birthdate) {
		this.birthdate = birthdate;
	}
	public List<Book> getWrittenBooks() {
		return writtenBooks;
	}
	public void setWrittenBooks(List<Book> writtenBooks) {
		this.writtenBooks = writtenBooks;
	}
	@Override
	public String toString() {
		return "Author [Aname=" + Aname + ", birthdate=" + birthdate + ", writtenBooks=" + writtenBooks + "]";
	}
	
	

}
