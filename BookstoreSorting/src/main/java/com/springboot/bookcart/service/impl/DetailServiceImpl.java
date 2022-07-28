package com.springboot.bookcart.service.impl;


import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.springboot.bookcart.model.Author;
import com.springboot.bookcart.model.Book;
import com.springboot.bookcart.repo.bookRepo;
import com.springboot.bookcart.service.BookService;
import com.springboot.bookcart.service.DetailService;

@Service

public class DetailServiceImpl implements DetailService{
	private bookRepo Bookerepo;

	public DetailServiceImpl(bookRepo Bookerepo) {
		super();
		this.Bookerepo = Bookerepo;
	}
	
	@Override
	public List<Book> serchisbnBooks(String query) {
		List<Book> books = Bookerepo.serchisbnBooks(query);
		return books;
		
	}

	@Override
	public List<Book> authorBooks(String query) {
		List<Book> books = Bookerepo.authorBooks(query);
		return books;
	}

	@Override
	public Book saveBook(Book book) {
		return Bookerepo.save(book);
	}

	
	
}
