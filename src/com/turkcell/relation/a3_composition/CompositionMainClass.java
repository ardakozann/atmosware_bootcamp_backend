package com.turkcell.relation.a3_composition;

import java.util.ArrayList;

public class CompositionMainClass {
	
	public static void main(String[] args) {
		
		// Single class
		Writer writer = new Writer();
		writer.setWriterName("Nesat Nuri Gultekin");
		
		// Null pointer exception almamak için önce liste oluşturmalısın.
		writer.setBookList(new ArrayList<Book>());
		
		// Multiple class
		Book book = new Book();
		book.setBookName("Calikusu");
		
		// Kitaba yazar ekledik.
		book.setWriter(writer);
		// Listeye kitap ekledim
		book.getWriter().getBookList().add(book);
		
		// (multiple Class-2)
		Book book2 = new Book();
		book2.setBookName("Yaprak Dokumu");
		book2.setWriter(writer); // kitaba yazar ekledim
		book2.getWriter().getBookList().add(book2); // Listeye kitap ekledim
		
		// yazar adý
		System.out.println("Yazar Adi: " + writer.getWriterName());
		
		// kitaplar
		for (Book temp : book.getWriter().getBookList()) {
			System.out.println(temp.getBookName());
			
		}
	}
	
}
