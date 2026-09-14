package spring.boot.udemy.course.backend.service;

import spring.boot.udemy.course.backend.domain.Book;

public interface BookService {

    Iterable<Book> findAll();
    Book findById(Long id);
    String sayHello();
}
