package com.example.demo.controller.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.HelloBean;
import com.example.demo.bean.HelloMessageGenerator;
import com.example.demo.service.GreetingService;

import jakarta.annotation.Resource;

@RestController
@RequestMapping("/api/core")
public class CoreController {

	@Autowired
	HelloBean bean;
	
	@Autowired
	GreetingService greetingService;
	
	@GetMapping("/bean-test")
	public String beanTest()
	{
		return this.bean.api() + this.greetingService.greet();
	}
	
	@Resource(name = "RequestScopeBean")
	HelloMessageGenerator requestScopeBean;
	
	@GetMapping("/request")
	public String request()
	{
		return this.requestScopeBean.getMessage();
	}
	
	
}
