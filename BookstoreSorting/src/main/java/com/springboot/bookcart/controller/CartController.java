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
import com.springboot.bookcart.service.BookService;
import com.springboot.bookcart.service.CartService;

@RestController
@RequestMapping("/api/cart")
public class CartController {

	private CartService cartService;
	
	public CartController(CartService cartService) {
		super();
	    this.cartService = cartService;			
	}
	@PostMapping()
	public ResponseEntity<Cart> saveCart(@RequestBody Cart cart){
		return new ResponseEntity<Cart>(cartService.saveCart(cart), HttpStatus.CREATED);
	}
	
	@GetMapping("/list")
	public ResponseEntity<List<Cart>> listCart(@RequestParam("query") String query){
		return ResponseEntity.ok(cartService.listCart(query));
	}
	
	@PutMapping("/list")
	public Cart update(@RequestBody Cart cart){
		return cartService.saveCart(cart);
	}
	
	
	//@GetMapping("/update")
	//public ResponseEntity<List<Cart>> updateCart(@RequestParam("value") int value, @RequestParam("name") String name){
	//	return ResponseEntity.ok(cartService.updateCart(value, name));
	//}
	
}
