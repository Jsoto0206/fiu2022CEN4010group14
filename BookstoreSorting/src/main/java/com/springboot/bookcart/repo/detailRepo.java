package com.springboot.bookcart.repo;
import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.springboot.bookcart.model.Book;
import com.springboot.bookcart.model.Author;

public interface detailRepo extends JpaRepository<Author, Long>{

}
