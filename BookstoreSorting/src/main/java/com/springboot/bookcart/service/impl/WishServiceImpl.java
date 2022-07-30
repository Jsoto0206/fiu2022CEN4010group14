package com.springboot.bookcart.service.impl;

import java.util.List;
import com.springboot.bookcart.model.Cart;
import com.springboot.bookcart.model.Wish;
import com.springboot.bookcart.repo.cartRepo;
import com.springboot.bookcart.repo.wishRepo;
import com.springboot.bookcart.service.CartService;
import com.springboot.bookcart.service.WishService;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import com.springboot.bookcart.model.Book;
import com.springboot.bookcart.repo.bookRepo;
import com.springboot.bookcart.service.BookService;

@Service
public class WishServiceImpl implements WishService{
	
	private wishRepo Wisherepo;
	
	public WishServiceImpl(wishRepo Wisherepo) {
		super();
		this.Wisherepo = Wisherepo;
	}
	
	@Override
	public Wish saveWish(Wish wish) {
		return Wisherepo.save(wish);
	}
	
	public List<Wish> listWish(String query) {
		List<Wish> wish = Wisherepo.listWish(query);
		return wish;
	}

	public List<Wish> moveWish() {
		List<Wish> wish = Wisherepo.moveWish();
		return wish;
	}
	
}
