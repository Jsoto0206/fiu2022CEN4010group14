package com.springboot.bookcart.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.springboot.bookcart.model.Book;
import com.springboot.bookcart.repo.bookRepo;
import com.springboot.bookcart.service.BookService;

@Service
public class BookServiceImpl implements BookService{

	private bookRepo Bookerepo;
	
	
	public BookServiceImpl(bookRepo Bookerepo) {
		super();
		this.Bookerepo = Bookerepo;
	}


	@Override
	public Book saveBook(Book book) {
		return Bookerepo.save(book);
	}



	@Override
	public List<Book> serchBooks(String query) {
		List<Book> books = Bookerepo.serchBooks(query);
		return books;
		//return Bookerepo.findAll();
	}


	@GetMapping
	@Override
	public List<Book> findBybookRatingGreaterThanquery(int query) {
		List<Book> findByBOOKGreaterThanEqual = Bookerepo.findBybookRatingGreaterThanEqual(query);
		return findByBOOKGreaterThanEqual;
	}

	@GetMapping
	@Override
	public List<Book> findbestsellers() {
		List<Book> findByBOOKGreaterThanEqual = Bookerepo.findTop10ByOrderBybooksSold();
		return findByBOOKGreaterThanEqual;
	}
	
}
