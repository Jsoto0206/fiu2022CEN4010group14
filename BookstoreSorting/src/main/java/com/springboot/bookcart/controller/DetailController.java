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
import com.springboot.bookcart.service.DetailService;


@RestController
@RequestMapping("/api/detail")
public class DetailController {

	private DetailService detailService;

	public DetailController(DetailService detailService) {
		super();
		this.detailService = detailService;
	}
	
	@GetMapping("/searchisbn")
	public ResponseEntity<List<Book>> serchisbnBooks(@RequestParam("query") String query){
		return ResponseEntity.ok(detailService.serchisbnBooks(query));
	}
	
	@GetMapping("/searchauthor")
	public ResponseEntity<List<Book>> authorBooks(@RequestParam("query") String query){
		return ResponseEntity.ok(detailService.authorBooks(query));
	}
	//create book REST API
		@PostMapping("/add")
		public ResponseEntity<Book> saveBook(@RequestBody Book book){
			return new ResponseEntity<Book>(detailService.saveBook(book), HttpStatus.CREATED);
		}
}
