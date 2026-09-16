package spring.boot.udemy.course.backend.service.book;

import spring.boot.udemy.course.backend.domain.book.Book;

public interface BookService {

    Iterable<Book> findAll();
    Book findById(Long id);
    String sayHello();
}
