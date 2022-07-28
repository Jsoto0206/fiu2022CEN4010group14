package com.springboot.bookcart.service;

import java.util.List;

import com.springboot.bookcart.model.Book;
import com.springboot.bookcart.model.Cart;

public interface CartService {
Cart saveCart(Cart cart);
List<Cart> listCart(String cart);
//List<Cart> updateCart(int value, String name);
}
