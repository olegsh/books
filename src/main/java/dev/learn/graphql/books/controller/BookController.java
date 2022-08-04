package dev.learn.graphql.books.controller;

import dev.learn.graphql.books.model.Book;
import dev.learn.graphql.books.repository.BookRepository;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class BookController {
  private final BookRepository bookRepository;

  public BookController(BookRepository bookRepository) {
    this.bookRepository = bookRepository;
  }

  @SchemaMapping(typeName = "Query", value = "allBooks")
  public List<Book> findAll() {
    return bookRepository.findAll();
  }

  @QueryMapping
  public Book findById(@Argument Integer id) {
    return bookRepository.findById(id);
  }
}
