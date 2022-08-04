package dev.learn.graphql.books.controller;

import dev.learn.graphql.books.repository.AuthorRepository;
import org.springframework.stereotype.Controller;

@Controller
public class AuthorController {
  private final AuthorRepository authorRepository;

  public AuthorController(AuthorRepository authorRepository) {
    this.authorRepository = authorRepository;
  }

}
