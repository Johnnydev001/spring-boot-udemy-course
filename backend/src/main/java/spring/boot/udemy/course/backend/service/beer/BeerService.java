package spring.boot.udemy.course.backend.service.beer;
import java.util.UUID;
import java.util.List;

import spring.boot.udemy.course.backend.domain.beer.Beer;
public interface BeerService {

    Beer getBeerById(UUID id);
    List<Beer> listBeers();
}
