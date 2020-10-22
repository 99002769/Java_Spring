package com.bookapps.client;

import com.bookapps.model.book;
import com.bookapps.service.BookService;
import com.bookapps.service.BookServiceImpl;
import java.util.*;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookService bookService = new BookServiceImpl();
		
		
	List<book> bookLists = bookService.getAllBooks();
	for(book book:bookLists)
	{
		System.out.println(book);
	}
	

}
}
