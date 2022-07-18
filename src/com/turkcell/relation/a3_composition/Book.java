package com.turkcell.relation.a3_composition;

import java.io.Serializable;

// N
public class Book implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String bookName;
	// Empati kurmak
	private Writer writer;
	
	public String getBookName() {
		return bookName;
	}
	
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	public Book() {
		
	}
	
	public Book(String bookName) {
		this.bookName = bookName;
	}
	
	public Writer getWriter() {
		return writer;
	}
	
	public void setWriter(Writer writer) {
		this.writer = writer;
	}
	
}
