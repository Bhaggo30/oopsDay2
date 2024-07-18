package com.bridgelabz;

import java.util.ArrayList;
import java.util.Iterator;

public class BookMainClass {
	public static void main(String[] args) {
		
		Book b1 = new Book("java programming", "james bosling","560");
		Book b2 = new Book("comic books","shinchan","667");
		Book b3 = new Book("python","guido","456");
		
		
		Book.addBook(b1);
		Book.addBook(b2);
		Book.addBook(b3);
		
		 ArrayList <Book> collection= Book.getCollection();
		 System.out.println("print the list of books ");
		 
		 for(Book books : collection) {
			 System.out.println("title of book"+books.getTitle()+ "name of the author "+books.getAuthor()+ "price of the books "+books.getPrice());
		 }
		 
		 Book.removeBook(b2);
		 
		 System.out.println("removing the books ");
		 System.out.println("list of the books");
		 for(Book books : collection) {
			 System.out.println("title of the book "+books.getTitle()+ "author "+books.getAuthor()+ "price"+books.getPrice());
		 }
		
		
	}

}
