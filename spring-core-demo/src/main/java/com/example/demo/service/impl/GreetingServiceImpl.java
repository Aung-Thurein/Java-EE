package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bean.PrototypeScopeBean;
import com.example.demo.service.GreetingService;

import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class GreetingServiceImpl implements GreetingService{
	
	@Autowired
	PrototypeScopeBean prototypebean;
	
	public GreetingServiceImpl()
	{
		
	}
	
	@Override
	public String greet() {
		return this.prototypebean.toString() + "Hello From Spring Greeting Service ref ->" + this;
	}

}
