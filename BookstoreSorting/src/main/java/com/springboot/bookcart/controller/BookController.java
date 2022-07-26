package com.springboot.bookcart.controller;


import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.bookcart.model.Book;
import com.springboot.bookcart.service.BookService;


@RestController
@RequestMapping("/api/book")
public class BookController {
	
	private BookService bookService;

	public BookController(BookService bookService) {
		super();
		this.bookService = bookService;
	}
	//create book REST API
	@PostMapping()
	public ResponseEntity<Book> saveBook(@RequestBody Book book){
		return new ResponseEntity<Book>(bookService.saveBook(book), HttpStatus.CREATED);
	}
	
	//get all books REST API
	@GetMapping("/searchGenre")
	public ResponseEntity<List<Book>> serchBooks(@RequestParam("query") String query){
		return ResponseEntity.ok(bookService.serchBooks(query));
	}
	
	@GetMapping("/searchname")
	public ResponseEntity<List<Book>> serchnameBooks(@RequestParam("query") Long query){
		return ResponseEntity.ok(bookService.serchnameBooks(query));
	}
	
	@GetMapping("/searchRating")
	public ResponseEntity<List<Book>> findBybookRatingGreaterThanquery(@RequestParam("query") int query){
		return ResponseEntity.ok(bookService.findBybookRatingGreaterThanquery(query));
	}
	
	@GetMapping("/searchsellers")
	public ResponseEntity<List<Book>> findbestsellers(){
		return ResponseEntity.ok(bookService.findbestsellers());
	}
	
}
