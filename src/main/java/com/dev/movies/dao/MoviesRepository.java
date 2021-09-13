package com.dev.movies.dao;

import com.dev.movies.model.Movies;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MoviesRepository extends CrudRepository<Movies, Long> {
    List<Movies> findByName(String name);

    @Override
    Optional<Movies> findById(Long id);
}
