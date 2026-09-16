package spring.boot.udemy.course.backend.service.i18N;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({ "EN", "default" })
@Service("i18nService")
public class EnglishService implements i18NService {

    @Override
    public String sayHello() {
        return "Hello";
    }
}
