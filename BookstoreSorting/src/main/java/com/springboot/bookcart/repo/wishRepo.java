package com.springboot.bookcart.repo;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.springboot.bookcart.model.Book;
import com.springboot.bookcart.model.Cart;
import com.springboot.bookcart.model.Wish;

public interface wishRepo extends JpaRepository<Wish, Long>{
	@Query("SELECT p FROM Wish p WHERE " +
            "p.username LIKE CONCAT('%',:query, '%')")
	List<Wish> listWish(@Param("query") String query);
	
	
	
	@Query(value = "INSERT INTO cart (username, bookid1, bookid2, bookid3, bookid4, bookid5, bookid6) SELECT username, bookid1, bookid2, bookid3, bookid4, bookid5, bookid6 FROM wish;", nativeQuery=true)
	List<Wish> moveWish();


}
