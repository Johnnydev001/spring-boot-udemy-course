package spring.boot.udemy.course.backend.controller;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest 
public class BeerControlerTest {

    @Autowired 
    private BeerController beerController;
    
    @Test 
    public void getBeerById(){
        System.out.println("Testing getBeerById");

        assertEquals("Superbock", beerController.getBeerById(UUID.randomUUID()).getBrand());
        
    }
}
