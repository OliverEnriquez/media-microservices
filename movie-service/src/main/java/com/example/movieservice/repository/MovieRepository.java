package com.example.movieservice.repository;

import com.example.movieservice.domain.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface MovieRepository extends JpaRepository<Movie, Long> {
}
