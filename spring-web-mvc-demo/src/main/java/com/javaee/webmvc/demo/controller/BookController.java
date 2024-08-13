package com.javaee.webmvc.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javaee.webmvc.demo.model.BookDto;
import com.javaee.webmvc.demo.service.BookService;

@Controller
@RequestMapping("/books")
public class BookController {

	@Autowired
	BookService bookService;
	
	
	@GetMapping
	String getAllBook(Model model)
	{
		List<BookDto> books = this.bookService.getAllBooks();
		model.addAttribute("books", books);
		return "books/book.html";
	}
}
