package com.springboot.bookcart.controller;


import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.bookcart.model.Book;
import com.springboot.bookcart.model.Cart;
import com.springboot.bookcart.model.Wish;
import com.springboot.bookcart.service.BookService;
import com.springboot.bookcart.service.CartService;
import com.springboot.bookcart.service.WishService;

@RestController
@RequestMapping("/api/wish")

public class WishController {
	private WishService wishService;
	
	public WishController (WishService wishService) {
		super();
	    this.wishService = wishService;	
	
	}
	@PostMapping()
	public ResponseEntity<Wish> saveWish(@RequestBody Wish wish){
		return new ResponseEntity<Wish>(wishService.saveWish(wish), HttpStatus.CREATED);
	}
	
	@GetMapping("/list")
	public ResponseEntity<List<Wish>> listWish(@RequestParam("query") String query){
		return ResponseEntity.ok(wishService.listWish(query));
	}
	
	
	@PutMapping("/update")
	public Wish update(@RequestBody Wish wish){
		return wishService.saveWish(wish);
	}
	
	@GetMapping("/move")
	public ResponseEntity<List<Wish>> moveWish(){
		return null;
	}
	
}
