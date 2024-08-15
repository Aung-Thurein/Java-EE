package com.javaee.webmvc.demo.controller;

import java.util.Calendar;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javaee.webmvc.demo.model.BookDto;

@Controller
@RequestMapping("/view-demo")
public class ViewDemoController {

	@GetMapping
	public String viewDemo(Model model)
	{	
		model.addAttribute("message", "Hello From Thymleaf");
		model.addAttribute("admin", true);
		return "/view-demo/demo";
	}
	
	@GetMapping(value = "another")
	public String anotherObject(Model model)
	{
		model.addAttribute("today", Calendar.getInstance());
		return "view-demo/demo";
	}
	
	@GetMapping(value = "/book")
	public String bookObject(Model model) 
	{
		BookDto bookDto = new BookDto(1, "Book Name", "Book's Author", "Description");
		model.addAttribute("book", bookDto);
		return "view-demo/book";
	}
}
