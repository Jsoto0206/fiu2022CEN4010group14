package com.springboot.bookcart.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ReaNotFoundExcpt extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8266739907640398216L;
	private String resourceName;
	private String name;
	private Object value;
	
	public ReaNotFoundExcpt(String resourceName, String name, Object value) {
		super(String.format("%s not found with %s : '%s'", resourceName, name, value));;
		this.resourceName = resourceName;
		this.name = name;
		this.value = value;
	}
	
	public String getResourceName() {
		return resourceName;
	}
	
	public String getFieldName() {
		return name;
	}
	
	public Object getFieldValue() {
		return value;
	}
	
}
