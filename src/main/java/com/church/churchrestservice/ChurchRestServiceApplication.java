package com.church.churchrestservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@EnableMongoRepositories
public class ChurchRestServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChurchRestServiceApplication.class, args);
    }

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/displayCards").allowedOrigins("http://localhost:8100");
                registry.addMapping("/basePageCards").allowedOrigins("http://localhost:8100");
                registry.addMapping("/seriesAndMinistries").allowedOrigins("http://localhost:8100");
                registry.addMapping("/eventsAndActivities").allowedOrigins("http://localhost:8100");
            }
        };
    }
}

