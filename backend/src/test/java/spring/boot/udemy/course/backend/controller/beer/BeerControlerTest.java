package spring.boot.udemy.course.backend.controller.beer;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Optional;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;
import spring.boot.udemy.course.backend.domain.beer.Beer;
import spring.boot.udemy.course.backend.exception.NotFoundException;
import spring.boot.udemy.course.backend.exception.IllegalArgumentException;

import spring.boot.udemy.course.backend.service.beer.BeerService;
import spring.boot.udemy.course.backend.service.beer.BeerServiceImpl;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.header;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@WebMvcTest(BeerController.class)
public class BeerControlerTest {
    @Autowired
    MockMvc mockMvc;

    @MockitoBean
    BeerService beerService;
    BeerServiceImpl beerServiceImpl = new BeerServiceImpl();

    @Test
    void getBeerById() throws Exception {
        UUID testId = UUID.randomUUID();
        Beer testBeer = beerServiceImpl.listBeers().get(0);

        given(beerService.getBeerById(testId)).willReturn(Optional.of(testBeer));

        mockMvc.perform(get("/api/v1/beers/" + testId)
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON));
    }

    @Test
    void getBeerByIdNotFound() throws Exception {
        UUID testId = UUID.randomUUID();
        given(beerService.getBeerById(testId)).willReturn(Optional.empty());
        mockMvc.perform(get("/api/v1/beers/" + testId)
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isNotFound());
    }

    @Test
    void getBeerByIdBadRequest() throws Exception {
        UUID testId = UUID.randomUUID();
        given(beerService.getBeerById(testId)).willThrow(IllegalArgumentException.class);
        mockMvc.perform(get("/api/v1/beers/" + testId)
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isBadRequest());
    }
}
