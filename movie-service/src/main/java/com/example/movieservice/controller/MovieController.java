package com.example.movieservice.controller;

import com.example.movieservice.domain.Movie;
import com.example.movieservice.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/movie")
@CrossOrigin
public class MovieController {

    @Autowired
    MovieService movieService;

    @GetMapping
    public List<Movie> findAllMovies() {
        return movieService.findMovies();
    }

    @PostMapping
    public void saveMovie(@RequestBody Movie movie) {
        movieService.addMovie(movie);
    }
}
