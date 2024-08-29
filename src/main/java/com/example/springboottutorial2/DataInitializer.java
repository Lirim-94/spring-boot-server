package com.example.springboottutorial2;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataInitializer {

    @Bean
    CommandLineRunner initDatabase(BookRepository repository) {
        return args -> {
            repository.save(new Book("The Great Gatsby", "F. Scott Fitzgerald",
                    "https://example.com/greatgatsby.jpg", "A novel about the American Dream."));
            repository.save(new Book("To Kill a Mockingbird", "Harper Lee",
                    "https://example.com/mockingbird.jpg", "A story of racial injustice and loss of innocence."));
            repository.save(new Book("1984", "George Orwell",
                    "https://example.com/1984.jpg", "A dystopian social science fiction novel."));
        };
    }
}
