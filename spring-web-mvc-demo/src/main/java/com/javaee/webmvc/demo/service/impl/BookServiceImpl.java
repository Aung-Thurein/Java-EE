package com.javaee.webmvc.demo.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.javaee.webmvc.demo.model.BookDto;
import com.javaee.webmvc.demo.service.BookService;

@Service
public class BookServiceImpl implements BookService{

	List<BookDto> book = new ArrayList<>();


	 BookServiceImpl()
	{
		this.book.add(new BookDto(1L,"Title 1", "Author 1", "Description 1"));
		this.book.add(new BookDto(2L,"Title 2", "Author 2", "Description 2"));
		
	}
	
	@Override
	public List<BookDto> getAllBooks() {
		return this.book;
	}

}
