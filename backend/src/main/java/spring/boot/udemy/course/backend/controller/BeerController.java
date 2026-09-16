package spring.boot.udemy.course.backend.controller;

import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import spring.boot.udemy.course.backend.service.BeerService;
import spring.boot.udemy.course.backend.domain.Beer;
import java.util.UUID;

@RestController 
@AllArgsConstructor  
public class BeerController {
    
    private final BeerService beerService;

    public Beer getBeerById(UUID id){
        return beerService.getBeerById(id);
    }
}
