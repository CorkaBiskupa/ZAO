package com.example.service;

import java.util.ArrayList;
import java.util.List;

import com.example.book.Book;


public class StorageService {
	
	private List<Book> db = new ArrayList<Book>();
	
	public void add(Book book){
		Book newBook = new Book(book.getTitle(), book.getAuthor(), book.getYear());
		db.add(newBook);
	}
	
	public List<Book> getAllBooks(){
		return db;
	}

	public void delete(int index){
		db.remove(index);
	}
	
	public int size(){
		int size=db.size();
		return size;
	}
}
