package com.javaee.webmvc.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.javaee.webmvc.demo.model.BookDto;
import com.javaee.webmvc.demo.service.BookService;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletRequest;

@Controller
@RequestMapping(value = "/Example")
public class ExampleController {

	@Autowired
	BookService bookService;
	
	@GetMapping(value = "api")
	@ResponseBody
	List<BookDto> getAllBookApi(ServletRequest request,
			@RequestHeader("Host") String host)
														
	{
		
		List<BookDto> books = bookService.getAllBooks();
		return books;
	}
	
	@GetMapping(value = "api/{bookID}")
	@ResponseBody
	BookDto getBookById(@PathVariable Integer bookID)
	{
		List<BookDto> books = bookService.getAllBooks();
		return books.get(bookID);
	}
	
	@GetMapping(value = "search")
	@ResponseBody
	List<BookDto> searchApi(@RequestParam String query)
	{
		List<BookDto> books = bookService.getAllBooks();
		return books;
	}
}

