package com.javaee.webmvc.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/controller")
public class HomeController {
	
	@GetMapping
	String test()
	{
		return "home";
	}
}
