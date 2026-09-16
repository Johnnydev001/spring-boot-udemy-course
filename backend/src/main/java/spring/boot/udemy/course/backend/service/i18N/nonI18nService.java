package spring.boot.udemy.course.backend.service.i18N;

import org.springframework.stereotype.Service;

@Service("noni18NService")
public class nonI18nService implements i18NService {
    @Override
    public String sayHello() {
        return "Hello from non-i18n service";
    }
}
