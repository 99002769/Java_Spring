package com.bookapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.bookapp.model.book;

@RestController
@RequestMapping("/client-api")
public class BookClientController {
	
	@Autowired
	RestTemplate restTemplate;
	static final String BASEURL = "http://localhost:8080/book-api";
	
	@GetMapping("/client-books")
	public List<book> showAllBooks()
	{
		String url = BASEURL + "/books";
		List<book> bookList = restTemplate.getForObject(url, List.class);
		return bookList;
	}
	
	@GetMapping("/client-books-by-author/{author}")
	public List<book> showBooksByAuthor(@PathVariable("author")String author)
	{

		String url = BASEURL + "/books-by-author/" +author;
		List<book> bookList = restTemplate.getForObject(url, List.class);
		return bookList;
	}
	
	@GetMapping("/client-books-by-category/{category}")
	public List<book> showBooksByCategory(@PathVariable("category")String category)
	{
		String url = BASEURL + "/books-by-category?category=" + category;
		List<book> bookList = restTemplate.getForObject(url, List.class);
		return bookList;
	
	}
	@GetMapping("/client-books-by-id/{bookid}")
	public book showBooksById(@PathVariable("bookid")int id)
	{
		String url = BASEURL + "/books-by-id/" +id;
		book book = restTemplate.getForObject(url, book.class);
		return book;
	}
	
	

}
