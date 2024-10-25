package com.entity;

public class Book {
	private int idbooks;
    private String title;
    private String author;
    private int quantity;

    public Book() {
    }

    public Book(int idbooks, String title, String author, int quantity) {
        this.idbooks = idbooks;
        this.title = title;
        this.author = author;
        this.quantity = quantity;
    }

    public int getBookId() {
        return idbooks;
    }

    public void setBookId(int idbooks) {
        this.idbooks = idbooks;
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + idbooks +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", quantity=" + quantity +
                '}';
    }
		 
		 
		 
}
