package com.example.springboottutorial2;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BookRepository extends CrudRepository<Book, Integer> {
List<Book> findByTitleContainingIgnoreCase(String title);
List<Book> findByAuthorContainingIgnoreCase(String author);
}
