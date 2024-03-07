package com.example.videogameservice.service;

import com.example.videogameservice.entity.VideoGame;
import com.example.videogameservice.repository.VideoGameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoGameServiceImpl implements VideoGameService{

    @Autowired
    VideoGameRepository videoGameRepository;
    @Override
    public List<VideoGame> findAllVideoGames() {
        return videoGameRepository.findAll();
    }

    @Override
    public void saveVideoGame(VideoGame videoGame) {
        videoGameRepository.save(videoGame);
    }
}
