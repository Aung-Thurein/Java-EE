package com.javaee.webmvc.demo.service;

import java.util.List;

import com.javaee.webmvc.demo.model.BookDto;

public interface BookService {

	List<BookDto> getAllBooks();
	
	void addBook(BookDto book);
	
}
