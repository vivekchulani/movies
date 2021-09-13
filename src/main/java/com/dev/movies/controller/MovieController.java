package com.dev.movies.controller;

import com.dev.movies.dao.MoviesRepository;
import com.dev.movies.model.Movies;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController()
@RequestMapping("/movies")
public class MovieController {

    private MoviesRepository moviesRepository;

    public MovieController(MoviesRepository moviesRepository) {
        this.moviesRepository = moviesRepository;
    }

    @GetMapping
    public Iterable<Movies> getMovies() {
        return moviesRepository.findAll();
    }

    @GetMapping("/{id}")
    public Movies getMovie(@PathVariable Long id) {
        return moviesRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Movies createMovie(@RequestBody Movies movie) {
        return moviesRepository.save(movie);
    }


}
