package com.springboot.bookcart.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.springboot.bookcart.model.Author;
import com.springboot.bookcart.model.Book;
import com.springboot.bookcart.repo.bookRepo;
import com.springboot.bookcart.repo.detailRepo;
import com.springboot.bookcart.service.BookService;
import com.springboot.bookcart.service.DetailAuthorService;
import com.springboot.bookcart.service.DetailService;

@Service
public class DetailAuthorServiceImpl implements DetailAuthorService{
	
	private detailRepo DetailerRepo;

	public DetailAuthorServiceImpl(detailRepo DetailerRepo) {
		super();
		this.DetailerRepo = DetailerRepo;
	}
	
	
	@Override
	public Author saveAuthor(Author author) {
		return DetailerRepo.save(author);
	}
}
