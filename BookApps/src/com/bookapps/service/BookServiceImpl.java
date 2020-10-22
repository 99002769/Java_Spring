package com.bookapps.service;

import java.util.List;

import com.bookapps.dao.BookDAO;
import com.bookapps.dao.BookDAOImpl;
import com.bookapps.model.book;

public class BookServiceImpl implements BookService {

	BookDAO bookDAO= new BookDAOImpl();
	
	@Override
	public List<book> getAllBooks() {
		// TODO Auto-generated method stub
		return bookDAO.getAllBooks();
	}

	@Override
	public List<book> getByAuthor(String author) {
		// TODO Auto-generated method stub
		
		return bookDAO.getByAuthor(author);
	}

	public List<book> getByCategory(String category) {
		// TODO Auto-generated method stub
		return bookDAO.getByCategory(category);
	}

	@Override
	public book getById(int id) {
		// TODO Auto-generated method stub
		return bookDAO.getById(id);
		
	}

	

}
