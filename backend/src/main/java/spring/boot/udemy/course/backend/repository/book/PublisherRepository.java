package spring.boot.udemy.course.backend.repository.book;

import org.springframework.data.repository.CrudRepository;

import spring.boot.udemy.course.backend.domain.book.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
