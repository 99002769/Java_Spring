package com.bookapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookapp.dao.BookRepository;
import com.bookapp.exception.BookNotFoundException;
import com.bookapp.model.Book;


@Service
public class BookServiceImpl implements BookService {
	
	@Autowired
	BookRepository bookRepository;
	

	@Override
	public Book addBook(Book book) {
		// TODO Auto-generated method stub
		Book newbook = bookRepository.save(book);
		return newbook;
	}

	@Override
	public boolean deleteBook(Integer bookid) throws BookNotFoundException {
		// TODO Auto-generated method stub
		bookRepository.deleteById(bookid);
		return true;
	}

	@Override
	public Book getBookById(Integer bookid) throws BookNotFoundException {
		// TODO Auto-generated method stub
	
				
		return bookRepository.findById(bookid)
				.orElseThrow(()-> new BookNotFoundException("Id not available"));
	}

	@Override
	public Book UpdateBook(Book book) {
		// TODO Auto-generated method stub
		
		return bookRepository.save(book);
	}

	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return bookRepository.findAll();
		
	}

	@Override
	public List<Book> getBookbyAuthor(String author) throws BookNotFoundException {
		// TODO Auto-generated method stub
		List<Book> bookList = bookRepository.findByAuthor(author);
		if(bookList.isEmpty())
		{
			throw new BookNotFoundException("Author not available");
		}
		return bookList;
	}

	@Override
	public List<Book> getBookbycategory(String category) throws BookNotFoundException {
		// TODO Auto-generated method stub

		List<Book> bookList = bookRepository.findByCategoryOrderByTitleAsc(category);
		if(bookList.isEmpty())
		{
			throw new BookNotFoundException("Author not available");
		}
		return bookList;
	}

	@Override
	public List<Book> findByTitleAndAuthor(String title, String author) throws BookNotFoundException {
		// TODO Auto-generated method stub
		List<Book> bookList = bookRepository.findByTitleAndAuthor(title,author);
		if(bookList.isEmpty())
		{
			throw new BookNotFoundException("Author not available");
		}
		return bookList;
		
	}

	

	@Override
	public List<Book> findBooksByTitleAndPrice(String title, double price) throws BookNotFoundException {
		// TODO Auto-generated method stub
		List<Book> bookList = bookRepository.findBooksByTitleAndPrice(title,price);
		if(bookList.isEmpty())
		{
			throw new BookNotFoundException("Author not available");
		}
		return bookList;
	}

}
