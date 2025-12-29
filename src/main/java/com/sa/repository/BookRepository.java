package com.sa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sa.dto.BookDto;
import com.sa.entity.Book;
@Repository
public interface BookRepository  extends  JpaRepository<Book, Long>{


}
