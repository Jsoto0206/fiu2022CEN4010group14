package com.springboot.bookcart.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Entity
@Table(name="Cart")
public class Cart {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
 private long id;
	
	@Column(name = "username", nullable = false)
	 private String username;
	
	@Column(name = "bookid1")
	private int bookid1;
	
	@Column(name = "bookid2")
	private int bookid2;
	
	@Column(name = "bookid3")
	private int bookid3;
	
	@Column(name = "bookid4")
	private int bookid4;

	@Column(name = "bookid5")
	private int bookid5;
	
	@Column(name = "bookid6")
	private int bookid6;
}
