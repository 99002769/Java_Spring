package com.bookapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.model.Book;
//import com.bookapp.model.book;
import com.bookapp.service.BookService;

//@RestController
//@RequestMapping("/book-api")
public class BookController {
	@Autowired
	BookService bookService;
	public BookController() {
		// TODO Auto-generated constructor stub
	
	}	
	
	@PostMapping("/books")
	Book addBook(@RequestBody Book book)
	{
		return bookService.addBook(book);
	}
	
	@DeleteMapping("/books/delete-one/{bookId}")
	boolean deleteBook(@PathVariable("bookId")Integer bookid) throws BookNotFoundException{
		return bookService.deleteBook(bookid);
	}
	
	@GetMapping("/books/get-one/{bookId}")
	Book getBooksById(@PathVariable("bookId")Integer bookid)throws BookNotFoundException
	{
		return bookService.getBookById(bookid);
	}
	
	@PutMapping("/books/update-one")
	Book updateBook(Book book) 
	{
		return bookService.UpdateBook(book);
	}
	
	@GetMapping("/books")
	
		List<Book> getAllBooks(){
			return bookService.getAllBooks();
			
		}
	
	@GetMapping("/books/author/{author}")
		List<Book> getBookbyAuthor(@PathVariable("author")String author) throws BookNotFoundException{
			return bookService.getBookbyAuthor(author);
			
		}
	
	
	@GetMapping("/books/category/{category}")
	
		List<Book> getBooksbyCategory(@PathVariable("category")String category) throws BookNotFoundException{
			return bookService.getBookbycategory(category);
			
		}
	
	@GetMapping("/books/titleauthor/{title}/{author}")
	
	List<Book> findByTitleAndAuthor(@PathVariable("title")String title,@PathVariable("author")String author) throws BookNotFoundException{
		return bookService.findByTitleAndAuthor(title,author);
		
	}
	
	@GetMapping("/books/titleprice/{title}/{price}")
	
	List<Book> findBooksByTitleAndPrice(@PathVariable("title")String title,@PathVariable("price")Double price) throws BookNotFoundException{
		return bookService.findBooksByTitleAndPrice(title,price);
		
	}
	
}
