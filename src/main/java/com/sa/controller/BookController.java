package com.sa.controller;

import java.util.List;
import java.util.Map;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sa.dto.AddBookRequestDto;
import com.sa.dto.BookDto;
import com.sa.service.BookService;

@RestController
public class BookController {

    private final ModelMapper modelMapper;

	@Autowired
	BookService bookService;
	
	AddBookRequestDto addBookRequestDto;

    BookController(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }
	
	@GetMapping("/books")
	List<BookDto> BookList(){
		return bookService.AllBook();
	}
	
	@GetMapping("/books/{id}")
	BookDto getBookById(@PathVariable Long id) {
		return bookService.BookById(id);
	}
	
	@PostMapping("/books")
	BookDto addBook( @RequestBody AddBookRequestDto addBookRequestDto) {
		
		return bookService.addBookdetail(addBookRequestDto) ;
	}
	
	@DeleteMapping("books/{id}")
	void deleteBook(@PathVariable Long id) {
		bookService.deleteBook(id);
		
	}
	
	@PutMapping("books/{id}")
	BookDto updateBook(@PathVariable Long id,
						@RequestBody AddBookRequestDto addBookRequestDto) {
		
		return bookService.updateBookDetails(id,addBookRequestDto);
		
	}
	
	@PatchMapping("/books/{id}")
	BookDto UpdatePartialBook(@PathVariable Long id , @RequestBody Map<String , Object> updates) {
		
		return bookService.updatePartialBookdetails(id, updates);
		
	}
	
	
	
}
