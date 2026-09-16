package spring.boot.udemy.course.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.boot.udemy.course.backend.service.i18nService;

@RestController
public class i18nController {

    private final i18nService i18nService;

    @Autowired
    public i18nController(@Qualifier("i18nService") i18nService i18nService) {
        this.i18nService = i18nService;
    }

    @GetMapping("/hello")
    public String sayHello() {
        return i18nService.sayHello();
    }
}
