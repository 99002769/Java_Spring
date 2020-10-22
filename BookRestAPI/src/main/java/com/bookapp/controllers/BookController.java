package com.bookapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.bookapp.model.book;
import com.bookapp.service.BookService;

@RestController
public class BookController {
	
	@Autowired
	BookService bookService;
	@GetMapping("/books")
	public List<book> showAllBooks()
	{
		return bookService.getAllBooks();
	}
	
	@GetMapping("/books-by-author/{author}")
	public List<book> showBooksByAuthor(@PathVariable("author")String author)
	{
		return bookService.getByAuthor(author);
	}
	
	@GetMapping("/books-by-category/{category}")
	public List<book> showBooksByCategory(@PathVariable("category")String category)
	{
		return bookService.getByCategory(category);
	
	}
	@GetMapping("/books-by-id/{bookid}")
	public book showBooksById(@PathVariable("bookid")int id)
	{
		return bookService.getById(id);
	}
	
	
	

}
