package books.manage;

import java.awt.print.Book;
import java.time.LocalDate;

public class Transcation {
  private Book book;
  private LocalDate date;
  private String trancationType;
public Transcation(Book book, LocalDate date, String trancationType) {
	super();
	this.book = book;
	this.date = date;
	this.trancationType = trancationType;
}
public Book getBook() {
	return book;
}
public void setBook(Book book) {
	this.book = book;
}
public LocalDate getDate() {
	return date;
}
public void setDate(LocalDate date) {
	this.date = date;
}
public String getTrancationType() {
	return trancationType;
}
public void setTrancationType(String trancationType) {
	this.trancationType = trancationType;
}
@Override
public String toString() {
	return "Transcation [book=" + book + ", date=" + date + ", trancationType=" + trancationType + "]";
}
  
  
  
}
