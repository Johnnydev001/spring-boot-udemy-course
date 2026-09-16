package spring.boot.udemy.course.backend.service.beer;


import java.math.BigDecimal;
import java.util.UUID;

import org.springframework.stereotype.Service;

import spring.boot.udemy.course.backend.domain.Beer;

@Service
public class BeerServiceImpl implements BeerService {

    @Override
    public Beer getBeerById(UUID id) {
        return Beer.builder().id(id).brand("Superbock").type("Lager").price(new BigDecimal(100000)).build();
    }

}
