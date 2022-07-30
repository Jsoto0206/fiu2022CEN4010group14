package com.springboot.bookcart.service;

import java.util.List;

import com.springboot.bookcart.model.Book;
import com.springboot.bookcart.model.Cart;
import com.springboot.bookcart.model.Wish;
public interface WishService {
	Wish saveWish(Wish wish);
	List<Wish> listWish(String wish);
	List<Wish> moveWish();
}
