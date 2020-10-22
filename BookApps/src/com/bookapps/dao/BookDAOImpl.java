package com.bookapps.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.bookapps.model.book;

public class BookDAOImpl implements BookDAO {

	@Override
	public List<book> getAllBooks() {
		// TODO Auto-generated method stub
		return showbookList();
	}

	@Override
	public List<book> getByAuthor(String author) {
		// TODO Auto-generated method stub
		List<book> newbookList = new ArrayList<>();
		for(book book : showbookList())
		{
			if(book.getCategory().equals(author))
				newbookList.add(book);
		}
		return newbookList;
	}

	@Override
	public book getById(int id) {
		// TODO Auto-generated method stub
		
		for(book book : showbookList())
		{
			if(book.getBookId()==id)
				return book;
		}
		return null;
		
	}

	public List<book> getByCategory(String category) {
		
		// TODO Auto-generated method stub
		List<book> newbookList = new ArrayList<>();
		for(book book : showbookList())
		{
			if(book.getAuthor().equals(category))
				newbookList.add(book);
		}
		return newbookList;
		
	}
	
	private List<book> showbookList(){
		return Arrays.asList(
				new book(1,"JAVA","john","Tech",990.0),
				new book(2,"C","Dennis Ritche","Star",1090.0),
				new book(3,"C++","Helson","Tech",910.0),
				new book(4,"OS","johnjos","Techs",990.0),
				new book(5,"JAVA","johnson","Star",990.0)
				
				
				);
	}

	
	

	
	

}
