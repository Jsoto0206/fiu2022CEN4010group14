package com.springboot.bookcart.service.impl;

import java.util.List;
import com.springboot.bookcart.model.Cart;
import com.springboot.bookcart.repo.cartRepo;
import com.springboot.bookcart.service.CartService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import com.springboot.bookcart.model.Book;
import com.springboot.bookcart.repo.bookRepo;
import com.springboot.bookcart.service.BookService;

@Service
public class CartServiceImpl implements CartService{

	private cartRepo Carterepo;
	
	public CartServiceImpl(cartRepo Carterepo) {
		super();
		this.Carterepo = Carterepo;
	}
	
	
	@Override
	public Cart saveCart(Cart cart) {
		return Carterepo.save(cart);
	}

//	@Override
	//public List<Cart> updateCart(int value, String name) {
	//	return null;
		//int Carts = Carterepo.updateCart(value , name);
		//return Carts;
		//return null;
	//}

	public List<Cart> listCart(String query) {
		List<Cart> cart = Carterepo.listCart(query);
		return cart;
	}



	
}
