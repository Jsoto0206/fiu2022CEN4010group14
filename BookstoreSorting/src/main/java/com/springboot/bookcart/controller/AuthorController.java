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

import com.springboot.bookcart.model.Author;
import com.springboot.bookcart.model.Book;
import com.springboot.bookcart.service.CartService;
import com.springboot.bookcart.service.DetailAuthorService;
import com.springboot.bookcart.service.DetailService;

@RestController
@RequestMapping("/api/detail")
public class AuthorController {

	private DetailAuthorService detailauthorService;
	
	public AuthorController(DetailAuthorService detailauthorService) {
		super();
	    this.detailauthorService = detailauthorService;	
	}
		@PostMapping("/author/add")
		public ResponseEntity<Author> saveAuthor(@RequestBody Author author){
			return new ResponseEntity<Author>(detailauthorService.saveAuthor(author), HttpStatus.CREATED);
		}
}
