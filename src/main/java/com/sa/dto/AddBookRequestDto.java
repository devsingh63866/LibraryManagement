package com.sa.dto;

public class AddBookRequestDto {

	private String name;
	
	
	
	public AddBookRequestDto( String name) {
		
		this.name = name;
	}
	
	public AddBookRequestDto() {};
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
