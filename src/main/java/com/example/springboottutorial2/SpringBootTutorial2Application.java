package com.example.springboottutorial2;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootTutorial2Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootTutorial2Application.class, args);
    }

    @Bean
    public CommandLineRunner demo(BookRepository repository) {
        return (args) -> {
            // Save a few books
            repository.save(new Book("The Great Gatsby", "F. Scott Fitzgerald",
                    "https://example.com/greatgatsby.jpg", "A novel about the American Dream."));
            repository.save(new Book("To Kill a Mockingbird", "Harper Lee",
                    "https://example.com/mockingbird.jpg", "A story of racial injustice and loss of innocence."));
            repository.save(new Book("1984", "George Orwell",
                    "https://example.com/1984.jpg", "A dystopian social science fiction novel."));
        };
    }
}
