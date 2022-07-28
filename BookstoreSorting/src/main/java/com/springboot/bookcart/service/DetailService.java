package com.springboot.bookcart.service;

import java.util.List;

import com.springboot.bookcart.model.Author;
import com.springboot.bookcart.model.Book;

public interface DetailService {
	List<Book> serchisbnBooks(String query);
	Book saveBook(Book book);
	List<Book> authorBooks(String query);

}
