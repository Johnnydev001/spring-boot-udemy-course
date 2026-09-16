package spring.boot.udemy.course.backend.service;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")
@Service("i18nService")
public class SpanishService implements i18nService {

    @Override
    public String sayHello() {
        return "Hola";
    }
}