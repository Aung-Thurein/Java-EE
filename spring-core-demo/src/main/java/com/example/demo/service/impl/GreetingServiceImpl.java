package com.example.demo.service.impl;

import org.springframework.stereotype.Service;

import com.example.demo.service.GreetingService;

import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class GreetingServiceImpl implements GreetingService{

	public GreetingServiceImpl()
	{
	}
	
	@Override
	public String greet() {
		return "Hello From Spring Greeting Service ref ->" + this;
	}

}
