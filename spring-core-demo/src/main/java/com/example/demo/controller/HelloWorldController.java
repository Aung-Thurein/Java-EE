package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.GreetingService;

import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;


@Slf4j
@RestController
@RequestMapping(value = "/api/")
public class HelloWorldController {

	int count = 0;
	@Autowired
	GreetingService greetingService;
	
	
	/* Constructor based
	public HelloWorldController(GreetingService greetingService)
	{
		this.greetingService = greetingService;
	}
	*/
	
	/*
	 * Setter Based
	public void setGreetingService(GreetingService greetingService)
	{
		this.greetingService = greetingService;
	}
		
	 */
	@GetMapping("/hello")
	String hello()
	{
		count++;
		return greetingService.greet()+ "Count"+count; 
	}
	
}
