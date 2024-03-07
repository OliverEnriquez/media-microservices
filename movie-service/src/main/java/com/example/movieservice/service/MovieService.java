package com.example.movieservice.service;

import com.example.movieservice.domain.Movie;

import java.util.List;

public interface MovieService {

    List<Movie> findMovies();

    void addMovie(Movie movie0);
}
