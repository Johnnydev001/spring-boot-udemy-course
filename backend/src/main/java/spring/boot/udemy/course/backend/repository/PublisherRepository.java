package spring.boot.udemy.course.backend.repository;

import org.springframework.data.repository.CrudRepository;
import spring.boot.udemy.course.backend.domain.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
