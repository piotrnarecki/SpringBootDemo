package pl.piotrnarecki.spring_boot_demo.student;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {

            Student mary = new Student("Mary", "mary@gmail.com", LocalDate.of(2000, Month.JANUARY, 5));

            Student alex = new Student("Alex", "alex@gmail.com", LocalDate.of(2004, Month.APRIL, 20));

            repository.saveAll(List.of(mary, alex));
        };

    }
}
