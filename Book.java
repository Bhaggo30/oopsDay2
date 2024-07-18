 package com.bridgelabz;

import java.util.ArrayList;

public class Book {
	
	private String title;
	private String author;
	private String price;
	private static ArrayList<Book> bookCollection = new ArrayList<Book>();
	public Book(String title, String author, String price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", price=" + price + "]";
	}
	public static  void addBook(Book book) {
		bookCollection.add(book);
	}
	public static void removeBook(Book book) {
		bookCollection.remove(book);
	}
	public static ArrayList<Book> getCollection(){
		return bookCollection;
	}
	
	

}
