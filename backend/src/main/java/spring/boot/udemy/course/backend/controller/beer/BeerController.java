package spring.boot.udemy.course.backend.controller.beer;

import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import spring.boot.udemy.course.backend.domain.Beer;
import spring.boot.udemy.course.backend.service.beer.BeerService;

import java.util.UUID;

@RestController 
@AllArgsConstructor  
public class BeerController {
    
    private final BeerService beerService;

    public Beer getBeerById(UUID id){
        return beerService.getBeerById(id);
    }
}
