package com.sa.service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sa.dto.AddBookRequestDto;
import com.sa.dto.BookDto;
import com.sa.entity.Book;
import com.sa.repository.BookRepository;


@Service
public class BookServiceImp implements BookService {

    @Autowired
    private  ModelMapper modelMapper;

	@Autowired
	BookRepository bookRepository;

   
	@Override
	public List<BookDto> AllBook() {
		List<Book> books = bookRepository.findAll();
		
		return books.stream().map(book -> new BookDto(book.getId(),book.getName())).toList();
		
	}

	@Override
	public BookDto saveBook(BookDto bookdto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BookDto BookById(Long id) {
		Optional<Book> book = bookRepository.findById(id);
		
		return modelMapper.map(book,BookDto.class);
	}

	@Override
	public BookDto addBookdetail(AddBookRequestDto addBookRequestDto) {
		Book newBook=modelMapper.map(addBookRequestDto, Book.class);
		Book book = bookRepository.save(newBook);
		
		return modelMapper.map(book, BookDto.class) ;
	}

	@Override
	public void deleteBook(Long id) {
		bookRepository.deleteById(id);
	}

	@Override
	public BookDto updateBookDetails(Long id, AddBookRequestDto addBookRequestDto) {

		Book book = bookRepository.findById(id)
		.orElseThrow(()-> new RuntimeException("Book not found"+id));
		
	    modelMapper.map(addBookRequestDto,book);
	    
	    Book updateBook = bookRepository.save(book);
	     
	    return modelMapper.map(updateBook, BookDto.class);
		
		
	}

	@Override
	public BookDto updatePartialBookdetails(Long id, Map<String, Object> updates) {
		
		Book book = bookRepository.findById(id)
				.orElseThrow(()-> new RuntimeException("Book not found"+id));
		
		updates.forEach((field,value)->{
			switch (field) {
			case "name": book.setName((String)value);
				break;
			
		  	default:
				throw new IllegalArgumentException("Field not supported"  );
			}
		});
		
		 Book updatedetails = bookRepository.save(book);
		return modelMapper.map(updatedetails, BookDto.class);
	
	}

	

	

	
	
	
	
	
}
