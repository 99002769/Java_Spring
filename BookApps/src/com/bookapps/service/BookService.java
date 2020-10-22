package com.bookapps.service;



import java.util.List;

import com.bookapps.model.book;

public interface BookService {
	List<book> getAllBooks();
	List<book> getByAuthor(String author);
	book getById(int id);
	List<book> getByCategory(String author);

}
