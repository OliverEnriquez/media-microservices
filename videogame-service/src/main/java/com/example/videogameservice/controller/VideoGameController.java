package com.example.videogameservice.controller;

import com.example.videogameservice.entity.VideoGame;
import com.example.videogameservice.service.VideoGameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/videogame")
@CrossOrigin
public class VideoGameController {

    @Autowired
    VideoGameService videoGameService;


    @GetMapping
    public List<VideoGame> getAllVideoGames() {
        return videoGameService.findAllVideoGames();
    }

    @PostMapping
    public void  saveVideoGame(@RequestBody VideoGame videoGame) {
        videoGameService.saveVideoGame(videoGame);
    }
}
