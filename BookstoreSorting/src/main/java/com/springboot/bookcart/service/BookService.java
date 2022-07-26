package com.springboot.bookcart.service;

import java.util.List;

import com.springboot.bookcart.model.Book;

public interface BookService {
  Book saveBook(Book book);
List<Book> serchBooks(String query);
List<Book> serchnameBooks(Long query);
List<Book> findBybookRatingGreaterThanquery(int query);
List<Book> findbestsellers();

}
