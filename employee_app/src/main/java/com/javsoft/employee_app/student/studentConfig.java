package com.javsoft.employee_app.student;

import java.time.LocalDate;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class studentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student shyla = new Student( "Shyla Stylez", "ShylaStylez@yahoo.com", LocalDate.of(1982, 9, 23));
            Student alexis = new Student( "Alexys Texas", "AlexysTexas@yahoo.com", LocalDate.of(1985, 5, 25));

            studentRepository.saveAll(List.of(shyla, alexis));
        };
    }
}
