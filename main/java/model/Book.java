package model;

import java.sql.Date;

public class Book {
    private String BookName;
    private String BookPublisher;
    private String BookAuthor;
    private Date Date;
    public Book(String name, String publisher, String author) {
		// TODO Auto-generated constructor stub
    	this.BookName=name;
    	this.BookPublisher=publisher;
    	this.BookAuthor=author;
    	
	}
	public String getBookName() {
        return BookName;
    }
    public void setBookName(String bookName) {
        BookName = bookName;
    }
    public String getBookPublisher() {
        return BookPublisher;
    }
    public void setBookPublisher(String bookPublisher) {
        BookPublisher = bookPublisher;
    }
    public String getBookAuthor() {
        return BookAuthor;
    }
    public void setBookAuthor(String bookAuthor) {
        BookAuthor = bookAuthor;
    }
    public Date getDate() {
        return Date;
    }
    public void setDate(Date date) {
        Date = date;
    }
    
}
