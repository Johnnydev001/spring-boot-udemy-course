package spring.boot.udemy.course.backend.repository.book;

import org.springframework.data.repository.CrudRepository;

import spring.boot.udemy.course.backend.domain.book.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
