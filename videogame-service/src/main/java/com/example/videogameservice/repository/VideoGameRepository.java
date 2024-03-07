package com.example.videogameservice.repository;

import com.example.videogameservice.entity.VideoGame;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface VideoGameRepository extends MongoRepository<VideoGame, Long> {
}
