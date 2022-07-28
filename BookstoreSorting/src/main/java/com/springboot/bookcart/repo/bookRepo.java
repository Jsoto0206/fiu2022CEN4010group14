package com.springboot.bookcart.repo;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.springboot.bookcart.model.Book;
import com.springboot.bookcart.model.Author;

public interface bookRepo extends JpaRepository<Book, Long>{

	@Query("SELECT p FROM Book p WHERE " +
            "p.bookGenre LIKE CONCAT('%',:query, '%')")
	List<Book> serchBooks(@Param("query") String query);
	
	@Query("SELECT p FROM Book p WHERE " +
            "p.id LIKE CONCAT('%',:query, '%')")
	List<Book> serchnameBooks(@Param("query") Long query);
	
	@Query("SELECT p FROM Book p WHERE " +
            "p.ISBN LIKE CONCAT('%',:query, '%')")
	List<Book> serchisbnBooks(@Param("query") String query);
	
	@Query("SELECT p FROM Book p WHERE " +
            "p.authorName LIKE CONCAT('%',:query, '%')")
	List<Book> serchauthor(@Param("query") String query);
	
	
	List<Book> findBybookRatingGreaterThanEqual(int query);
	
	@Query(value = "SELECT * FROM books ORDER BY books_sold DESC limit 5;", nativeQuery=true)
	List<Book> findTop10ByOrderBybooksSold();

	
	@Query("SELECT p FROM Book p WHERE " +
            "p.authorName LIKE CONCAT('%',:query, '%')")
	List<Book> authorBooks(@Param("query") String query);
}
