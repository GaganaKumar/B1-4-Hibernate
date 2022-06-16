package dao;

import java.util.List;

import entities.Book;

public interface BookDao {
	public abstract void getBookId(int id);
	public abstract List<BookDao>getBookByTitle(String title);
	public abstract List<BookDao>getAuthorBooks(String author);
	public abstract List<BookDao>getBookPriceRange(double low,double high);
	public abstract List<BookDao>getAllBooks();
	public abstract Long getBookCount();
}
