package com.springboot.bookcart.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="Author")
public class Author {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
 private long id;
	
	@Column(name = "authorname", nullable = false)
	 private String authorname;
	
	@Column(name = "lastname")
	private String lastname;
	
	@Column(name = "biography")
	private String biography;
	
	@Column(name = "publisher")
	private String publisher;

}
