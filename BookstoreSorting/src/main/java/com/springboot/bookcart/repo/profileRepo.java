package com.springboot.bookcart.repo;
import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.springboot.bookcart.model.Book;
import com.springboot.bookcart.model.Profile;

public interface profileRepo extends JpaRepository<Profile, Long>{
	//@Modifying
	//@Query("UPDATE profile p set p.bookid4 = p.value where p.username = :name")
	//int updateProfile(@Param("value") Integer value,@Param("name") String name);
	
	@Query("SELECT p FROM Profile p WHERE " +
            "p.username LIKE CONCAT('%',:query, '%')")
	List<Profile> listProfile(@Param("query") String query);
	
}
