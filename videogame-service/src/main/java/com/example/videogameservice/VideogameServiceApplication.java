package com.example.videogameservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class VideogameServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(VideogameServiceApplication.class, args);
    }

}
