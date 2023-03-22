package com.example.h2demo;

import com.example.h2demo.entities.Adherent;
import com.example.h2demo.repos.AdherantRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class H2demoApplication {

    public static void main(String[] args) {
        SpringApplication.run(H2demoApplication.class, args);
    }
    @Bean
    CommandLineRunner runner (AdherantRepo repository) {
        return args -> {
            repository.save(new Adherent(null, "A", "B", 29));
            repository.save(new Adherent(null, "A", "B", 29));
        };
    }

}
