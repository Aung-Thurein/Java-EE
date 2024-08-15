package com.javaee.webmvc.demo.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BookDto{
	
	private long id;

	@NotBlank(message = "{required.book.title}")
	@Size(min = 3, max = 100, message = "{size.book.title}")
	private String title;
	
	@NotBlank(message = "{required.book.author}")
	@Size(min = 3, max = 100, message = "{size.book.author}")
	private String author;
	
	@NotBlank(message = "{required.book.description}")
	@Size(min = 3, max = 100, message = "{size.book.description}")
	private String description;

	public BookDto() {
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
	
	public BookDto(long id, String author, String title, String description) {
		super();
		this.id = id;
		this.author = author;
		this.title = title;
		this.description = description;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
}