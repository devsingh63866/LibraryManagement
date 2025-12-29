package com.sa.service;

import java.util.List;
import java.util.Map;

import com.sa.dto.AddBookRequestDto;
import com.sa.dto.BookDto;

public interface BookService {
	
	List<BookDto> AllBook();
	
	BookDto saveBook (BookDto bookdto);

	BookDto BookById(Long id);

	BookDto addBookdetail(AddBookRequestDto addBookRequestDto);
	
	void deleteBook(Long id);

	BookDto updateBookDetails(Long id, AddBookRequestDto addBookRequestDto);
	
	BookDto updatePartialBookdetails(Long id , Map<String, Object> updates);

}

