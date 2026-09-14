package spring.boot.udemy.course.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import spring.boot.udemy.course.backend.controller.BookController;

@SpringBootApplication
public class BackendApplication {

	static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(BackendApplication.class, args);
		BookController bookController;
		bookController = ctx.getBean(BookController.class);

		System.out.println(bookController.sayHelloWithDI());
		System.out.println(bookController.sayHelloNoDI());
	}

}
