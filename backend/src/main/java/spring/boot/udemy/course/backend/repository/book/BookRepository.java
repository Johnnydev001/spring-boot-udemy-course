package spring.boot.udemy.course.backend.repository.book;

import org.springframework.data.repository.CrudRepository;

import spring.boot.udemy.course.backend.domain.book.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
}
