package spring.boot.udemy.course.backend.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BookControllerTest {

    @Autowired
    private BookController bookController;

    @Test
    void sayHelloWithDI() {
        System.out.printf(bookController.sayHelloWithDI());
    }

    @Test
    void sayHelloNoDI() {
        System.out.printf(bookController.sayHelloNoDI());

    }
}