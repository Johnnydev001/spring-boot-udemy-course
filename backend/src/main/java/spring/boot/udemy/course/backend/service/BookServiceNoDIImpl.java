package spring.boot.udemy.course.backend.service;

public class BookServiceNoDIImpl implements BookServiceNoDI {
    @Override
    public String sayHello() {
        return "Hello from the Book Service without DI";
    }
}
