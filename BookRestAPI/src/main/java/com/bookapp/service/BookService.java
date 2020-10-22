package com.bookapp.service;



import java.util.List;

import com.bookapp.model.book;

public interface BookService {
	List<book> getAllBooks();
	List<book> getByAuthor(String author);
	book getById(int id);
	List<book> getByCategory(String category);

}
