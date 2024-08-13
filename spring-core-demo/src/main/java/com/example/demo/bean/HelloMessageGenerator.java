package com.example.demo.bean;

import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;


@Slf4j
public class HelloMessageGenerator {
	
	private String message = "Defaut Message";
	
	public void setMessage(String message) {
		this.message = message;
	
	}
	
	public String getMessage() {
		return message;
	}
}	
