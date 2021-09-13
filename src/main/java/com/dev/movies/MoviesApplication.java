package com.dev.movies;

import com.dev.movies.dao.MoviesRepository;
import com.dev.movies.model.Movies;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MoviesApplication {

    public static void main(String[] args) {
        SpringApplication.run(MoviesApplication.class, args);
    }

    @Bean
    public CommandLineRunner initialize(MoviesRepository moviesRepository) {
        return (args) -> {
          moviesRepository.save(new Movies("Mars Travels", 5));
          moviesRepository.save(new Movies("How to Save Lives", 7));
          moviesRepository.save(new Movies("Getting By", 2));
          moviesRepository.save(new Movies("Waiting to Return", 9));
        };
    }

}
