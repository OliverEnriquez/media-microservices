package com.example.movieservice.service;

import com.example.movieservice.domain.Movie;
import com.example.movieservice.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService{

    @Autowired
    MovieRepository movieRepository;

    @Override
    public List<Movie> findMovies() {
        return (List<Movie>) movieRepository.findAll();
    }

    @Override
    public void addMovie(Movie movie) {
        movieRepository.save(movie);
    }
}
