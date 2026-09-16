package spring.boot.udemy.course.backend.controller.book;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import spring.boot.udemy.course.backend.domain.book.Book;
import spring.boot.udemy.course.backend.service.book.BookService;
import spring.boot.udemy.course.backend.service.book.BookServiceNoDI;
import spring.boot.udemy.course.backend.service.book.BookServiceNoDIImpl;

@Controller
public class BookController {

    private final BookService bookService;
    private final BookServiceNoDI bookServiceNoDI;

    public BookController(BookService bookService) {
        this.bookService = bookService;
        this.bookServiceNoDI = new BookServiceNoDIImpl(); //Incorrectly done -> No DI makes it harder to develop and test!
    }

    @RequestMapping("/books")
    public ResponseEntity<Iterable<Book>> findAllBooks() {
        return ResponseEntity.ok(bookService.findAll());
    }

    @RequestMapping("/books/{id}")
    public ResponseEntity<Book> findById(@PathVariable Long id) {
        return ResponseEntity.ok(bookService.findById(id));
    }

    // Testing with Dependency Injection
    public String sayHelloWithDI() {
        System.out.println("I'm in the controller");
        return bookService.sayHello();
    }

    public String sayHelloNoDI() {
        System.out.println("I'm in the controller");
        return bookServiceNoDI.sayHello();
    }

}
