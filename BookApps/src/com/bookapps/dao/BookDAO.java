package com.bookapps.dao;

import java.util.List;

import com.bookapps.model.book;

public interface BookDAO {
	List<book> getAllBooks();
	List<book> getByAuthor(String author);
	book getById(int id);
	List<book> getByCategory(String author);
}
