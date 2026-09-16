package spring.boot.udemy.course.backend.service.beer;
import spring.boot.udemy.course.backend.domain.Beer;
import java.util.UUID;
public interface BeerService {

    Beer getBeerById(UUID id);
    
}
