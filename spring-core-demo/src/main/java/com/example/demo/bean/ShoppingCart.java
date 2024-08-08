package com.example.demo.bean;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Component
@SessionScope
public class ShoppingCart {
	
	List<String> item = new ArrayList<>();
	public ShoppingCart() {
	}
	
	public void addToCart(String item)
	{
		this.item.add(item);
	}
	
	public int getNoOfItems()
	{
		return this.item.size();
	}
}
