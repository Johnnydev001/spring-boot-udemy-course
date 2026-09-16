package spring.boot.udemy.course.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ActiveProfiles("ES")
@SpringBootTest 
public class i18nControllerTestEs {
    
    @Autowired 
    private i18nController i18nController;

    @Test
    void sayHello() {
        String response = i18nController.sayHello();
        assertEquals("Hola", response);
    }

}
