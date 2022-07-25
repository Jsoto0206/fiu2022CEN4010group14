package com.springboot.bookcart.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Entity
@Table(name="Books")
@Data public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
 private long id;
	
	@Column(name = "isbn", nullable = false)
	 private String ISBN;
	
	@Column(name = "Book_Title")
	private String bookTitle;
	
	@Column(name = "author_Name")
	private String authorName;
	
	@Column(name = "year_Released")
	private String yearReleased;
	
	@Column(name = "book_Genre")
	private String bookGenre;
 
	@Column(name = "book_Rating")
	private int bookRating;
	
	@Column(name = "books_Sold")
	private int booksSold;
	
	@Column(name = "books_Description")
	private String booksDescription;
	
	@Column(name = "book_Price")
	private double bookPrice;
	
	@Column(name = "book_Pub")
	private String bookPub;
}
