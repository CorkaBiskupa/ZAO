package com.example.book;

public class Book {
	
	private String title = "Biblia";
	private String author = "Praca zbiorowa";
	private int year = -5000;
	
	public Book() {
		super();
	}
	
	public Book(String title, String author, int year) {
		super();
		this.title=title;
		this.author=author;
		this.year=year;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
		
}