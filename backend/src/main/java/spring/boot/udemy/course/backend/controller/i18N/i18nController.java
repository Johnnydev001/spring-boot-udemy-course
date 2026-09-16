package spring.boot.udemy.course.backend.controller.i18N;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import spring.boot.udemy.course.backend.service.i18N.i18NService;

@RestController
public class i18nController {

    private final i18NService i18NService;

    @Autowired
    public i18nController(@Qualifier("noni18NService") i18NService i18NService) {
        this.i18NService = i18NService;
    }

    @GetMapping("/hello")
    public String sayHello() {
        return i18NService.sayHello();
    }
}
