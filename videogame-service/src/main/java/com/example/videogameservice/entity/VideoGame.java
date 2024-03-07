package com.example.videogameservice.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection  = "videogame")
@Data
public class VideoGame {

    @Id
    private String idVideoGame;
    private String videoGameName;
    private String videoGameGender;
    private Double rate;
    private String urlImage;
}
