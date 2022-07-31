package com.springboot.bookcart.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Entity
@Table(name="Profile")
@Data public class Profile {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
 private long id;
	
	@Column(name = "username", nullable = false)
	 private String username;
	
	@Column(name = "pass", nullable = false)
	 private String pass;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "home")
	private String home;
	
	@Column(name = "cards")
	private String cards;
	
	
	

}
