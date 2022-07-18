package com.turkcell.relation.a3_composition;

import java.io.Serializable;
import java.util.List;

// 1
public class Writer implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String writerName;
	// Empati kurmak
	private List<Book> bookList;
	
	public String getWriterName() {
		return writerName;
	}
	
	public void setWriterName(String writerName) {
		this.writerName = writerName;
	}
	
	public Writer() {
		
	}
	
	public Writer(String writerName) {
		super();
		this.writerName = writerName;
	}
	
	public List<Book> getBookList() {
		return bookList;
	}
	
	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}
}
