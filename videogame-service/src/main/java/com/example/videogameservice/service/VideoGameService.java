package com.example.videogameservice.service;

import com.example.videogameservice.entity.VideoGame;
import java.util.List;
public interface VideoGameService {
    List<VideoGame> findAllVideoGames();

    void saveVideoGame(VideoGame videoGame);
}
