package dao;

import java.util.List;
import java.util.logging.ErrorManager;

import javax.naming.spi.DirectoryManager;

import org.hibernate.mapping.TypeDef;

import entities.Book;

public class BookDaoImp implements BookDao {
	private DirectoryManager entityManager;
	public BookDaoImp() {
		entityManager=JPAUtil.getEntityManager();
		
	}

	public Book getBookId(int id) {
		// TODO Auto-generated method stub
		Book book=((Object) entityManager).find(Book.class, id);
		return;
	}

	@Override
	public List<BookDao> getBookByTitle(String title) {
		// TODO Auto-generated method stub
		String qStr = "Select book From Book book Where book.title=:ptitle";
		TypedQuery<Book> query=entityManager.createQuery(qStr,Book.class);
		return query.getResultList();
	}

	public List<Book> getAuthorBooks(String author) {
		// TODO Auto-generated method stub
		String qStr = "Select book From Book1 book Where book.author=:pAuthor";
		TypeDef<Book> query=((Object) entityManager).createQuery(qStr,Book.class);
		List<Book>booklist=query.getResultList();
		return booklist;
	}

	public List<BookDao> getBookPriceRange(double low, double high) {
		// TODO Auto-generated method stub
		//String qStr = "Select book From Book1 book Where book.price= between:low author";
		String qStr = "SELECT book FROM Book1 book WHERE book.price between :low and :high";
		TypedQuery<Book> query = entityManager.createQuery(qStr,Book.class);
		query.setParameter("low",low);
		query.setParameter("high",high);

		List<Book>booklist=query.getResultList();
		
		return booklist;
	}


	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		javax.persistence.Query query=entityManager.createNamedQuery("getAllBooks");
		@SuppressWarnings("unchecked")
		List<Book>booklist=query.getResultList();
		
		return booklist;
	}

	@Override
	public Long getBookCount() {
		// TODO Auto-generated method stub
		String qStr = "SELECT COUNT(book.id) FROM Book1 book";
		TypedQuery<Long> query = entityManager.createQuery(qStr,Long.class);
		Long count=query.getSingleResult();
		return count;
	}
}