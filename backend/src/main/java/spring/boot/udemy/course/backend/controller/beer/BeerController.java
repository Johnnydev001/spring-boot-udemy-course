package spring.boot.udemy.course.backend.controller.beer;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import spring.boot.udemy.course.backend.domain.beer.Beer;
import spring.boot.udemy.course.backend.exception.NotFoundException;
import spring.boot.udemy.course.backend.service.beer.BeerService;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/beers")
public class BeerController {
    private final BeerService beerService;

    @GetMapping()
    public List<Beer> listBeers() {
        return beerService.listBeers();
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public Beer getBeerById(@PathVariable("id") UUID id) {

        log.debug("Get Beer by Id - in controller");

        HttpHeaders headers = new HttpHeaders();
        headers.add("Location", "api/v1/beers/" + id.toString());

        return beerService.getBeerById(id).orElseThrow(NotFoundException::new);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Beer> createBeer(){
        log.info("Creating new beer");
        HttpHeaders headers = new HttpHeaders();
        headers.add("Location", "api/v1/beers/" + UUID.randomUUID().toString());
        return ResponseEntity.status(HttpStatus.CREATED).headers(headers).body(Beer.builder().build());
    }

}