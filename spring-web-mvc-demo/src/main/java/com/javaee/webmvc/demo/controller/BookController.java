package com.javaee.webmvc.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javaee.webmvc.demo.model.BookDto;
import com.javaee.webmvc.demo.service.BookService;

import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/books")
public class BookController {

	@Autowired
	BookService bookService;
	
	
	@GetMapping(value = "/new")
	String newBook(Model model)
	{
	
		BookDto book = new BookDto();
		model.addAttribute("book", book);
		return "books/new.html";
	}
	
	@PostMapping(value = "/new")
	String saveBook(Model model,@Valid @ModelAttribute("book") BookDto book, BindingResult bindingResult)
	{
		if(bindingResult.hasErrors())
		{
		
			return "books/new.html";
		}
		
		else 
		{
			//save Book
			this.bookService.addBook(book);
			model.addAttribute("newBookSaved", "New Book have been saved.");
			return "/books/new.html";
		}
	}
	
	@GetMapping
	String getAllBook(Model model)
	{
		List<BookDto> books = this.bookService.getAllBooks();
		model.addAttribute("books", books);
		
		return "books/book.html";
	}	
}
