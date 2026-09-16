package spring.boot.udemy.course.backend.service;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("i18nService")
public class EnglishService implements i18nService{


    @Override
    public String sayHello() {
        return "Hello";
    }
}
