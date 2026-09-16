package spring.boot.udemy.course.backend.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import spring.boot.udemy.course.backend.domain.Book;
import spring.boot.udemy.course.backend.repository.BookRepository;

@Primary
@Service
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }
    @Override
    public Iterable<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public Book findById(Long id){
        return bookRepository.findById(id).orElse(null);
    }

    @Override
    public String sayHello() {
        return "Hello from the Book Service with DI";
    }
}
