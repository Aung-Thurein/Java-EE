package com.javaee.webmvc.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/view-demo")
public class ViewDemoController {

	@GetMapping
	public String viewDemo(Model model)
	{	
		model.addAttribute("message", "Hello From Thymleaf");
		return "/view-demo/demo";
	}
}
