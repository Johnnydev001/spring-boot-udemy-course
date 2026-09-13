package spring.boot.udemy.course.backend.repository;

import org.springframework.data.repository.CrudRepository;
import spring.boot.udemy.course.backend.domain.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
}
